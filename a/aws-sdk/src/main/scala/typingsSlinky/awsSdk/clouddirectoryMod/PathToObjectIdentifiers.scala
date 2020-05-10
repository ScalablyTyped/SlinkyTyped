package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathToObjectIdentifiers extends js.Object {
  /**
    * Lists ObjectIdentifiers starting from directory root to the object in the request.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.native
  /**
    * The path that is used to identify the object starting from directory root.
    */
  var Path: js.UndefOr[PathString] = js.native
}

object PathToObjectIdentifiers {
  @scala.inline
  def apply(): PathToObjectIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathToObjectIdentifiers]
  }
  @scala.inline
  implicit class PathToObjectIdentifiersOps[Self <: PathToObjectIdentifiers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectIdentifiers(value: ObjectIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: PathString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(js.undefined)
        ret
    }
  }
  
}

