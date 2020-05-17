package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplexAspect extends js.Object {
  var complexObject: ComplexObject = js.native
  var originalValues: js.Object = js.native
  var parent: js.Object = js.native
  var parentProperty: DataProperty = js.native
  def getEntityAspect(): EntityAspect = js.native
  def getPropertyPath(propName: String): String = js.native
}

object ComplexAspect {
  @scala.inline
  def apply(
    complexObject: ComplexObject,
    getEntityAspect: () => EntityAspect,
    getPropertyPath: String => String,
    originalValues: js.Object,
    parent: js.Object,
    parentProperty: DataProperty
  ): ComplexAspect = {
    val __obj = js.Dynamic.literal(complexObject = complexObject.asInstanceOf[js.Any], getEntityAspect = js.Any.fromFunction0(getEntityAspect), getPropertyPath = js.Any.fromFunction1(getPropertyPath), originalValues = originalValues.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentProperty = parentProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexAspect]
  }
  @scala.inline
  implicit class ComplexAspectOps[Self <: ComplexAspect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplexObject(value: ComplexObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetEntityAspect(value: () => EntityAspect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntityAspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPropertyPath(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertyPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOriginalValues(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentProperty(value: DataProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProperty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

