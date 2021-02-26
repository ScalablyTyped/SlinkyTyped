package typingsSlinky.fileSize

import typingsSlinky.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-size", JSImport.Namespace)
  @js.native
  def apply[T /* <: Options */](bytes: Double): Required[T] with Result = js.native
  @JSImport("file-size", JSImport.Namespace)
  @js.native
  def apply[T /* <: Options */](bytes: Double, options: T): Required[T] with Result = js.native
  
  @js.native
  trait Bits extends StObject {
    
    var fixed: String = js.native
    
    var result: Double = js.native
  }
  object Bits {
    
    @scala.inline
    def apply(fixed: String, result: Double): Bits = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bits]
    }
    
    @scala.inline
    implicit class BitsMutableBuilder[Self <: Bits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Calculated extends StObject {
    
    var bits: Bits = js.native
    
    var fixed: String = js.native
    
    var magnitude: Double = js.native
    
    var result: Double = js.native
    
    var suffix: String = js.native
  }
  object Calculated {
    
    @scala.inline
    def apply(bits: Bits, fixed: String, magnitude: Double, result: Double, suffix: String): Calculated = {
      val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], magnitude = magnitude.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calculated]
    }
    
    @scala.inline
    implicit class CalculatedMutableBuilder[Self <: Calculated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBits(value: Bits): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var fixed: js.UndefOr[Double] = js.native
    
    var spacer: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixed(value: Double): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setSpacer(value: String): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    def calculate(): Calculated = js.native
    def calculate(spec: Spec): Calculated = js.native
    
    def human(): String = js.native
    def human(spec: Spec): String = js.native
    
    def to(unit: Unit): String = js.native
    def to(unit: Unit, spec: Spec): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fileSize.fileSizeStrings.si
    - typingsSlinky.fileSize.fileSizeStrings.iec
    - typingsSlinky.fileSize.fileSizeStrings.jedec
  */
  trait Spec extends StObject
  object Spec {
    
    @scala.inline
    def iec: typingsSlinky.fileSize.fileSizeStrings.iec = "iec".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.iec]
    
    @scala.inline
    def jedec: typingsSlinky.fileSize.fileSizeStrings.jedec = "jedec".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.jedec]
    
    @scala.inline
    def si: typingsSlinky.fileSize.fileSizeStrings.si = "si".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.si]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fileSize.fileSizeStrings.B
    - typingsSlinky.fileSize.fileSizeStrings.KB
    - typingsSlinky.fileSize.fileSizeStrings.MB
    - typingsSlinky.fileSize.fileSizeStrings.GB
    - typingsSlinky.fileSize.fileSizeStrings.TB
    - typingsSlinky.fileSize.fileSizeStrings.PB
    - typingsSlinky.fileSize.fileSizeStrings.EB
    - typingsSlinky.fileSize.fileSizeStrings.ZB
    - typingsSlinky.fileSize.fileSizeStrings.YB
  */
  trait Unit extends StObject
  object Unit {
    
    @scala.inline
    def B: typingsSlinky.fileSize.fileSizeStrings.B = "B".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.B]
    
    @scala.inline
    def EB: typingsSlinky.fileSize.fileSizeStrings.EB = "EB".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.EB]
    
    @scala.inline
    def GB: typingsSlinky.fileSize.fileSizeStrings.GB = "GB".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.GB]
    
    @scala.inline
    def KB: typingsSlinky.fileSize.fileSizeStrings.KB = "KB".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.KB]
    
    @scala.inline
    def MB: typingsSlinky.fileSize.fileSizeStrings.MB = "MB".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.MB]
    
    @scala.inline
    def PB: typingsSlinky.fileSize.fileSizeStrings.PB = "PB".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.PB]
    
    @scala.inline
    def TB: typingsSlinky.fileSize.fileSizeStrings.TB = "TB".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.TB]
    
    @scala.inline
    def YB: typingsSlinky.fileSize.fileSizeStrings.YB = "YB".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.YB]
    
    @scala.inline
    def ZB: typingsSlinky.fileSize.fileSizeStrings.ZB = "ZB".asInstanceOf[typingsSlinky.fileSize.fileSizeStrings.ZB]
  }
}
