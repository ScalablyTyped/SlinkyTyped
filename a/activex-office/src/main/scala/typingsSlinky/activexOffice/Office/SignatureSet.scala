package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureSet extends StObject {
  
  def apply(iSig: Double): Signature = js.native
  
  def Add(): Signature = js.native
  
  def AddNonVisibleSignature(): Signature = js.native
  def AddNonVisibleSignature(varSigProv: js.Any): Signature = js.native
  
  def AddSignatureLine(): Signature = js.native
  def AddSignatureLine(varSigProv: js.Any): Signature = js.native
  
  val Application: js.Any = js.native
  
  val CanAddSignatureLine: Boolean = js.native
  
  def Commit(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(iSig: Double): Signature = js.native
  
  val Parent: js.Any = js.native
  
  val ShowSignaturesPane: Boolean = js.native
  
  var Subset: MsoSignatureSubset = js.native
}
