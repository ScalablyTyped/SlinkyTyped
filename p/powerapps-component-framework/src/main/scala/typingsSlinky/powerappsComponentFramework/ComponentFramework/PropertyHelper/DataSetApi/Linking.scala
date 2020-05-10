package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dataset entity linking.
			 */
@js.native
trait Linking extends js.Object {
  /**
  				 * Add a new linked entity relationship with the existed query primary entity
  				 */
  def addLinkedEntity(expression: LinkEntityExposedExpression): Unit = js.native
  /**
  				 * Returns all the linked entities information
  				 */
  def getLinkedEntities(): js.Array[LinkEntityExposedExpression] = js.native
}

object Linking {
  @scala.inline
  def apply(
    addLinkedEntity: LinkEntityExposedExpression => Unit,
    getLinkedEntities: () => js.Array[LinkEntityExposedExpression]
  ): Linking = {
    val __obj = js.Dynamic.literal(addLinkedEntity = js.Any.fromFunction1(addLinkedEntity), getLinkedEntities = js.Any.fromFunction0(getLinkedEntities))
    __obj.asInstanceOf[Linking]
  }
  @scala.inline
  implicit class LinkingOps[Self <: Linking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddLinkedEntity(value: LinkEntityExposedExpression => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLinkedEntity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLinkedEntities(value: () => js.Array[LinkEntityExposedExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLinkedEntities")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

