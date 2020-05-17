package typingsSlinky.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  /**
    * Get parameterization containing this parameter
    * @returns The parameterization        object
    */
  def getContainingParameterization(): Parameterization = js.native
  /**
    * Get label
    * @returns The (possibly language-dependent) label text for this         parameter
    */
  def getLabelText(): String = js.native
  /**
    * Get the name of the parameter
    * @returns The name of the parameter, which is identical with the         name of the property
    * representing the parameter in the         parameterization entity type
    */
  def getName(): String = js.native
  /**
    * Get property for the parameter representing the peer boundary of the sameinterval
    * @returns The parameter representing         the peer boundary of the same interval. This means that
    * if         *this* parameter is a lower boundary, the returned object
    */
  def getPeerIntervalBoundaryParameter(): Parameter = js.native
  /**
    * Get property
    */
  def getProperty(): js.Any = js.native
  /**
    * Get text property related to this parameter
    * @returns The DataJS object representing the text property or         null if it does not exist
    */
  def getTextProperty(): js.Any = js.native
  /**
    * Get the URI to locate the entity set holding the value set, if it isavailable.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    */
  def getURIToValueEntitySet(sServiceRootURI: String): Unit = js.native
  /**
    * Get indicator if the parameter represents an interval boundary
    * @returns True iff it represents an interval boundary, otherwise         false
    */
  def isIntervalBoundary(): Boolean = js.native
  /**
    * Get indicator if the parameter represents the lower boundary of aninterval
    * @returns True iff it represents the lower boundary of an         interval, otherwise false
    */
  def isLowerIntervalBoundary(): Boolean = js.native
  /**
    * Get indicator whether or not the parameter is optional
    * @returns True iff the parameter is optional
    */
  def isOptional(): Boolean = js.native
  /**
    * Get indicator if a set of values is available for this parameter.Typically, this is true for
    * parameters with a finite set of known valuessuch as products, business partners in different roles,
    * organizationunits, and false for integer or date parameters
    * @returns True iff a value set is available, otherwise false
    */
  def isValueSetAvailable(): Boolean = js.native
}

object Parameter {
  @scala.inline
  def apply(
    getContainingParameterization: () => Parameterization,
    getLabelText: () => String,
    getName: () => String,
    getPeerIntervalBoundaryParameter: () => Parameter,
    getProperty: () => js.Any,
    getTextProperty: () => js.Any,
    getURIToValueEntitySet: String => Unit,
    isIntervalBoundary: () => Boolean,
    isLowerIntervalBoundary: () => Boolean,
    isOptional: () => Boolean,
    isValueSetAvailable: () => Boolean
  ): Parameter = {
    val __obj = js.Dynamic.literal(getContainingParameterization = js.Any.fromFunction0(getContainingParameterization), getLabelText = js.Any.fromFunction0(getLabelText), getName = js.Any.fromFunction0(getName), getPeerIntervalBoundaryParameter = js.Any.fromFunction0(getPeerIntervalBoundaryParameter), getProperty = js.Any.fromFunction0(getProperty), getTextProperty = js.Any.fromFunction0(getTextProperty), getURIToValueEntitySet = js.Any.fromFunction1(getURIToValueEntitySet), isIntervalBoundary = js.Any.fromFunction0(isIntervalBoundary), isLowerIntervalBoundary = js.Any.fromFunction0(isLowerIntervalBoundary), isOptional = js.Any.fromFunction0(isOptional), isValueSetAvailable = js.Any.fromFunction0(isValueSetAvailable))
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContainingParameterization(value: () => Parameterization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainingParameterization")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLabelText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPeerIntervalBoundaryParameter(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPeerIntervalBoundaryParameter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProperty(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextProperty(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetURIToValueEntitySet(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getURIToValueEntitySet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsIntervalBoundary(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIntervalBoundary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLowerIntervalBoundary(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLowerIntervalBoundary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOptional(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptional")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValueSetAvailable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValueSetAvailable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

