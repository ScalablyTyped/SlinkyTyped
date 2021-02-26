package typingsSlinky.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ajv.mod.RefParams
  - typingsSlinky.ajv.mod.LimitParams
  - typingsSlinky.ajv.mod.AdditionalPropertiesParams
  - typingsSlinky.ajv.mod.DependenciesParams
  - typingsSlinky.ajv.mod.FormatParams
  - typingsSlinky.ajv.mod.ComparisonParams
  - typingsSlinky.ajv.mod.MultipleOfParams
  - typingsSlinky.ajv.mod.PatternParams
  - typingsSlinky.ajv.mod.RequiredParams
  - typingsSlinky.ajv.mod.TypeParams
  - typingsSlinky.ajv.mod.UniqueItemsParams
  - typingsSlinky.ajv.mod.CustomParams
  - typingsSlinky.ajv.mod.PatternRequiredParams
  - typingsSlinky.ajv.mod.PropertyNamesParams
  - typingsSlinky.ajv.mod.IfParams
  - typingsSlinky.ajv.mod.SwitchParams
  - typingsSlinky.ajv.mod.NoParams
  - typingsSlinky.ajv.mod.EnumParams
*/
trait ErrorParameters extends StObject
object ErrorParameters {
  
  @scala.inline
  def AdditionalPropertiesParams(additionalProperty: String): typingsSlinky.ajv.mod.AdditionalPropertiesParams = {
    val __obj = js.Dynamic.literal(additionalProperty = additionalProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.AdditionalPropertiesParams]
  }
  
  @scala.inline
  def ComparisonParams(comparison: String, exclusive: Boolean, limit: Double | String): typingsSlinky.ajv.mod.ComparisonParams = {
    val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.ComparisonParams]
  }
  
  @scala.inline
  def CustomParams(keyword: String): typingsSlinky.ajv.mod.CustomParams = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.CustomParams]
  }
  
  @scala.inline
  def DependenciesParams(deps: String, depsCount: Double, missingProperty: String, property: String): typingsSlinky.ajv.mod.DependenciesParams = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], depsCount = depsCount.asInstanceOf[js.Any], missingProperty = missingProperty.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.DependenciesParams]
  }
  
  @scala.inline
  def EnumParams(allowedValues: js.Array[_]): typingsSlinky.ajv.mod.EnumParams = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.EnumParams]
  }
  
  @scala.inline
  def FormatParams(format: String): typingsSlinky.ajv.mod.FormatParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.FormatParams]
  }
  
  @scala.inline
  def IfParams(failingKeyword: String): typingsSlinky.ajv.mod.IfParams = {
    val __obj = js.Dynamic.literal(failingKeyword = failingKeyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.IfParams]
  }
  
  @scala.inline
  def LimitParams(limit: Double): typingsSlinky.ajv.mod.LimitParams = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.LimitParams]
  }
  
  @scala.inline
  def MultipleOfParams(multipleOf: Double): typingsSlinky.ajv.mod.MultipleOfParams = {
    val __obj = js.Dynamic.literal(multipleOf = multipleOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.MultipleOfParams]
  }
  
  @scala.inline
  def PatternParams(pattern: String): typingsSlinky.ajv.mod.PatternParams = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.PatternParams]
  }
  
  @scala.inline
  def PatternRequiredParams(missingPattern: String): typingsSlinky.ajv.mod.PatternRequiredParams = {
    val __obj = js.Dynamic.literal(missingPattern = missingPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.PatternRequiredParams]
  }
  
  @scala.inline
  def PropertyNamesParams(propertyName: String): typingsSlinky.ajv.mod.PropertyNamesParams = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.PropertyNamesParams]
  }
  
  @scala.inline
  def RefParams(ref: String): typingsSlinky.ajv.mod.RefParams = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.RefParams]
  }
  
  @scala.inline
  def RequiredParams(missingProperty: String): typingsSlinky.ajv.mod.RequiredParams = {
    val __obj = js.Dynamic.literal(missingProperty = missingProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.RequiredParams]
  }
  
  @scala.inline
  def SwitchParams(caseIndex: Double): typingsSlinky.ajv.mod.SwitchParams = {
    val __obj = js.Dynamic.literal(caseIndex = caseIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.SwitchParams]
  }
  
  @scala.inline
  def TypeParams(`type`: String): typingsSlinky.ajv.mod.TypeParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.TypeParams]
  }
  
  @scala.inline
  def UniqueItemsParams(i: Double, j: Double): typingsSlinky.ajv.mod.UniqueItemsParams = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ajv.mod.UniqueItemsParams]
  }
}
