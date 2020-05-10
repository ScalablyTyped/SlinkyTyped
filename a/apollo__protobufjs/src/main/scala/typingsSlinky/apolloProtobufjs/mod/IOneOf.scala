package typingsSlinky.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOneOf extends js.Object {
  /** Oneof field names */
  var oneof: js.Array[String] = js.native
  /** Oneof options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object IOneOf {
  @scala.inline
  def apply(oneof: js.Array[String]): IOneOf = {
    val __obj = js.Dynamic.literal(oneof = oneof.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOneOf]
  }
  @scala.inline
  implicit class IOneOfOps[Self <: IOneOf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOneof(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneof")(value.asInstanceOf[js.Any])
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

