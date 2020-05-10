package typingsSlinky.emberObject.mod.emberUtilsPrivateTypesAugmentingMod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.emberObject.mod.EmberObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeLookup extends js.Object {
  var `class`: Instantiable0[EmberObject] = js.native
  var instance: EmberObject = js.native
}

object TypeLookup {
  @scala.inline
  def apply(`class`: Instantiable0[EmberObject], instance: EmberObject): TypeLookup = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeLookup]
  }
  @scala.inline
  implicit class TypeLookupOps[Self <: TypeLookup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: Instantiable0[EmberObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: EmberObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

