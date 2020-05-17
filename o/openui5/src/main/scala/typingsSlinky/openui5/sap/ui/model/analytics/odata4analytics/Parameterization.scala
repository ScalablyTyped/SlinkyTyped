package typingsSlinky.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameterization extends js.Object {
  /**
    * Find parameter by name
    * @param sName Parameter name
    * @returns The parameter object with         this name or null if it does not exist
    */
  def findParameterByName(sName: String): Parameter = js.native
  /**
    * Get the names of all parameters part of the parameterization
    * @returns List of all parameter names
    */
  def getAllParameterNames(): js.Array[String] = js.native
  /**
    * Get all parameters included in this parameterization
    * @returns An object with individual JS properties for each         parameter included in the query
    * result. The JS object properties         all are objects of type odata4analytics.Parameter. The     
    *    names of the JS object properties are given by the OData entity         type property names
    * representing the parameter keys.
    */
  def getAllParameters(): js.Any = js.native
  /**
    * Get the entity set representing this query result in the OData model
    * @returns The OData entity set         representing this query result
    */
  def getEntitySet(): EntitySet = js.native
  /**
    * Get the entity type defining the type of this query result in the ODatamodel
    * @returns The OData entity type for         this query result
    */
  def getEntityType(): EntityType = js.native
  /**
    * Get the name of the parameter
    * @returns The name of the parameterization, which is identical         with the name of the entity
    * set representing the         parameterization in the OData service
    */
  def getName(): String = js.native
  /**
    * Get navigation property to query result
    * @returns The parameter object with         this name or null if it does not exist
    */
  def getNavigationPropertyToQueryResult(): QueryResult = js.native
}

object Parameterization {
  @scala.inline
  def apply(
    findParameterByName: String => Parameter,
    getAllParameterNames: () => js.Array[String],
    getAllParameters: () => js.Any,
    getEntitySet: () => EntitySet,
    getEntityType: () => EntityType,
    getName: () => String,
    getNavigationPropertyToQueryResult: () => QueryResult
  ): Parameterization = {
    val __obj = js.Dynamic.literal(findParameterByName = js.Any.fromFunction1(findParameterByName), getAllParameterNames = js.Any.fromFunction0(getAllParameterNames), getAllParameters = js.Any.fromFunction0(getAllParameters), getEntitySet = js.Any.fromFunction0(getEntitySet), getEntityType = js.Any.fromFunction0(getEntityType), getName = js.Any.fromFunction0(getName), getNavigationPropertyToQueryResult = js.Any.fromFunction0(getNavigationPropertyToQueryResult))
    __obj.asInstanceOf[Parameterization]
  }
  @scala.inline
  implicit class ParameterizationOps[Self <: Parameterization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindParameterByName(value: String => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findParameterByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAllParameterNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllParameterNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAllParameters(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEntitySet(value: () => EntitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntitySet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEntityType(value: () => EntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntityType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNavigationPropertyToQueryResult(value: () => QueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNavigationPropertyToQueryResult")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

