package typingsSlinky.googleapis.discoveryV1Mod.discoveryV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRestResource extends js.Object {
  /**
    * Methods on this resource.
    */
  var methods: js.UndefOr[StringDictionary[SchemaRestMethod]] = js.native
  /**
    * Sub-resources on this resource.
    */
  var resources: js.UndefOr[StringDictionary[SchemaRestResource]] = js.native
}

object SchemaRestResource {
  @scala.inline
  def apply(): SchemaRestResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestResource]
  }
  @scala.inline
  implicit class SchemaRestResourceOps[Self <: SchemaRestResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethods(value: StringDictionary[SchemaRestMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: StringDictionary[SchemaRestResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
  }
  
}

