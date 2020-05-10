package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomFilter[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */] extends js.Object {
  /**
  	 * Custom filter parameters to be passed to the generator function
  	 */
  var customFilterParameters: CustomFilterParameters[FParams] = js.native
  /**
  	 * Type must be 'CustomFilter'
  	 */
  var `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter = js.native
  /**
  	 * Function to generate the filter component
  	 */
  @JSName("getElement")
  def getElement_CustomFilter(
    filterHandler: js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
      Unit
    ],
    customFilterParameters: CustomFilterParameters[FParams]
  ): ReactElement = js.native
}

object CustomFilter {
  @scala.inline
  def apply[FParams, FElement](
    customFilterParameters: CustomFilterParameters[FParams],
    getElement: (js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
      Unit
    ], CustomFilterParameters[FParams]) => ReactElement,
    `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter
  ): CustomFilter[FParams, FElement] = {
    val __obj = js.Dynamic.literal(customFilterParameters = customFilterParameters.asInstanceOf[js.Any], getElement = js.Any.fromFunction2(getElement))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFilter[FParams, FElement]]
  }
  @scala.inline
  implicit class CustomFilterOps[Self[fparams, felement] <: CustomFilter[fparams, felement], FParams, FElement] (val x: Self[FParams, FElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FParams, FElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FParams, FElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[FParams, FElement]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[FParams, FElement]) with Other]
    @scala.inline
    def withCustomFilterParameters(value: CustomFilterParameters[FParams]): Self[FParams, FElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFilterParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetElement(
      value: (js.Function2[
          /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
          /* type */ js.UndefOr[typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
          Unit
        ], CustomFilterParameters[FParams]) => ReactElement
    ): Self[FParams, FElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter): Self[FParams, FElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

