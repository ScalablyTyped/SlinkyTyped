package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValues extends js.Object {
  
  def Add(Index: Double, PropertyValue: IPropertyValue): Unit = js.native
  
  def Clone(): IPropertyValues = js.native
  
  def CloneFrom(PropertyValues: IPropertyValues): Unit = js.native
  
  val Count: Double = js.native
  
  def IndexOf(PropertyDef: Double): Double = js.native
  def IndexOf(PropertyDef: MFBuiltInPropertyDef): Double = js.native
  
  def IndexOfByAlias(Vault: IVault, PropertyDefAlias: String): Double = js.native
  
  def Item(Index: Double): IPropertyValue = js.native
  def Item(Index: Double, value: IPropertyValue): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  def SearchForProperty(PropertyDef: Double): IPropertyValue = js.native
  def SearchForProperty(PropertyDef: MFBuiltInPropertyDef): IPropertyValue = js.native
  
  def SearchForPropertyByAlias(Vault: IVault, PropertyDefAlias: String, ReturnNULLIfNotFound: Boolean): IPropertyValue = js.native
  
  def SearchForPropertyEx(PropertyDef: Double, ReturnNULLIfNotFound: Boolean): IPropertyValue = js.native
  def SearchForPropertyEx(PropertyDef: MFBuiltInPropertyDef, ReturnNULLIfNotFound: Boolean): IPropertyValue = js.native
}
