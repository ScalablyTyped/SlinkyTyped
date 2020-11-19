package typingsSlinky.ejWebAll.ej.datavisualization.Barcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbologyType extends js.Object
@JSGlobal("ej.datavisualization.Barcode.SymbologyType")
@js.native
object SymbologyType extends js.Object {
  
  //Represents the Codabar barcode
  @js.native
  sealed trait Codabar extends SymbologyType
  
  //Represents the Code 11 barcode
  @js.native
  sealed trait Code11 extends SymbologyType
  
  //Represents the Code 128 A barcode
  @js.native
  sealed trait Code128A extends SymbologyType
  
  //Represents the Code 128 B barcode
  @js.native
  sealed trait Code128B extends SymbologyType
  
  //Represents the Code 128 C barcode
  @js.native
  sealed trait Code128C extends SymbologyType
  
  //Represents the Code 32 barcode
  @js.native
  sealed trait Code32 extends SymbologyType
  
  //Represents the Code 39 barcode
  @js.native
  sealed trait Code39 extends SymbologyType
  
  //Represents the Code 39 Extended barcode
  @js.native
  sealed trait Code39Extended extends SymbologyType
  
  //Represents the Code 93 barcode
  @js.native
  sealed trait Code93 extends SymbologyType
  
  //Represents the Code 93 Extended barcode
  @js.native
  sealed trait Code93Extended extends SymbologyType
  
  //Represents the Data Matrix barcode
  @js.native
  sealed trait DataMatrix extends SymbologyType
  
  //Represents the QR code
  @js.native
  sealed trait QRBarcode extends SymbologyType
}
