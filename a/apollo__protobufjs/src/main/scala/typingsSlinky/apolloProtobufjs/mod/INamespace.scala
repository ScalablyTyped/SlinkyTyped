package typingsSlinky.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamespace extends AnyNestedObject {
  /** Nested object descriptors */
  var nested: js.UndefOr[StringDictionary[AnyNestedObject]] = js.native
  /** Namespace options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object INamespace {
  @scala.inline
  def apply(): INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INamespace]
  }
  @scala.inline
  implicit class INamespaceOps[Self <: INamespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNested(value: StringDictionary[AnyNestedObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nested")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

