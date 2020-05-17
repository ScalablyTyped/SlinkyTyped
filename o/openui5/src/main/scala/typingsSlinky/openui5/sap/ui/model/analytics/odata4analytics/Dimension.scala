package typingsSlinky.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimension extends js.Object {
  /**
    * Find attribute by name
    * @param sName Attribute name
    * @returns The dimension attribute         object with this name or null if it does not exist
    */
  def findAttributeByName(sName: String): Dimension = js.native
  /**
    * Get the names of all attributes included in this dimension
    * @returns List of all attribute names
    */
  def getAllAttributeNames(): js.Array[String] = js.native
  /**
    * Get all attributes of this dimension
    * @returns An object with individual JS properties for each         attribute of this dimension. The
    * JS object properties all are         objects of type odata4analytics.DimensionAttribute. The        
    * names of the JS object properties are given by the OData entity         type property names
    * representing the dimension attribute keys.
    */
  def getAllAttributes(): js.Any = js.native
  /**
    * Get query result containing this dimension
    * @returns The query result object
    */
  def getContainingQueryResult(): QueryResult = js.native
  /**
    * Get associated hierarchy
    * @returns The hierarchy object or null if there is none. It can         be an instance of class      
    *   odata4analytics.RecursiveHierarchy (TODO later: or a         leveled hierarchy). Use methods
    * isLeveledHierarchy and         isRecursiveHierarchy to determine object type.
    */
  def getHierarchy(): js.Any = js.native
  /**
    * Get the key property
    * @returns The DataJS object representing the property for the         dimension key
    */
  def getKeyProperty(): js.Any = js.native
  /**
    * Get label
    * @returns The (possibly language-dependent) label text for this         dimension
    */
  def getLabelText(): String = js.native
  /**
    * Get master data entity set for this dimension
    * @returns The master data entity set        for this dimension, or null, if it does not exist
    */
  def getMasterDataEntitySet(): EntitySet = js.native
  /**
    * Get the name of the dimension
    * @returns The name of this dimension, which is identical to the         name of the dimension key
    * property in the entity type
    */
  def getName(): String = js.native
  /**
    * Get super-ordinate dimension
    * @returns The super-ordinate dimension or null if there is none
    */
  def getSuperOrdinateDimension(): js.Any = js.native
  /**
    * Get text property related to this dimension
    * @returns The DataJS object representing the text property or         null if it does not exist
    */
  def getTextProperty(): js.Any = js.native
  /**
    * Get indicator whether or not master data is available for this dimension
    * @returns True iff master data is available
    */
  def hasMasterData(): Boolean = js.native
}

object Dimension {
  @scala.inline
  def apply(
    findAttributeByName: String => Dimension,
    getAllAttributeNames: () => js.Array[String],
    getAllAttributes: () => js.Any,
    getContainingQueryResult: () => QueryResult,
    getHierarchy: () => js.Any,
    getKeyProperty: () => js.Any,
    getLabelText: () => String,
    getMasterDataEntitySet: () => EntitySet,
    getName: () => String,
    getSuperOrdinateDimension: () => js.Any,
    getTextProperty: () => js.Any,
    hasMasterData: () => Boolean
  ): Dimension = {
    val __obj = js.Dynamic.literal(findAttributeByName = js.Any.fromFunction1(findAttributeByName), getAllAttributeNames = js.Any.fromFunction0(getAllAttributeNames), getAllAttributes = js.Any.fromFunction0(getAllAttributes), getContainingQueryResult = js.Any.fromFunction0(getContainingQueryResult), getHierarchy = js.Any.fromFunction0(getHierarchy), getKeyProperty = js.Any.fromFunction0(getKeyProperty), getLabelText = js.Any.fromFunction0(getLabelText), getMasterDataEntitySet = js.Any.fromFunction0(getMasterDataEntitySet), getName = js.Any.fromFunction0(getName), getSuperOrdinateDimension = js.Any.fromFunction0(getSuperOrdinateDimension), getTextProperty = js.Any.fromFunction0(getTextProperty), hasMasterData = js.Any.fromFunction0(hasMasterData))
    __obj.asInstanceOf[Dimension]
  }
  @scala.inline
  implicit class DimensionOps[Self <: Dimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindAttributeByName(value: String => Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAttributeByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAllAttributeNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllAttributeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAllAttributes(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContainingQueryResult(value: () => QueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainingQueryResult")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHierarchy(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHierarchy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetKeyProperty(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeyProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLabelText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMasterDataEntitySet(value: () => EntitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMasterDataEntitySet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSuperOrdinateDimension(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuperOrdinateDimension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextProperty(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasMasterData(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMasterData")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

