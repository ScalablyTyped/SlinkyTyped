package typingsSlinky.bytes

import typingsSlinky.bytes.bytesStrings.b_
import typingsSlinky.bytes.bytesStrings.gb_
import typingsSlinky.bytes.bytesStrings.kb_
import typingsSlinky.bytes.bytesStrings.mb_
import typingsSlinky.bytes.bytesStrings.pb_
import typingsSlinky.bytes.bytesStrings.tb_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parse string to an integer in bytes.
    */
  @JSImport("bytes", JSImport.Namespace)
  @js.native
  def apply(value: String): Double = js.native
  @JSImport("bytes", JSImport.Namespace)
  @js.native
  def apply(value: Double): String = js.native
  @JSImport("bytes", JSImport.Namespace)
  @js.native
  def apply(value: Double, options: BytesOptions): String = js.native
  
  /**
    * Format the given value in bytes into a string.
    *
    * If the value is negative, it is kept as such.
    * If it is a float, it is rounded.
    */
  @JSImport("bytes", "format")
  @js.native
  def format(value: Double): String = js.native
  @JSImport("bytes", "format")
  @js.native
  def format(value: Double, options: BytesOptions): String = js.native
  
  /**
    * Parse the string value into an integer in bytes.
    *
    * If no unit is given, it is assumed the value is in bytes.
    */
  @JSImport("bytes", "parse")
  @js.native
  def parse(value: String): Double = js.native
  @JSImport("bytes", "parse")
  @js.native
  def parse(value: Double): Double = js.native
  
  @js.native
  trait BytesOptions extends StObject {
    
    var decimalPlaces: js.UndefOr[Double] = js.native
    
    var fixedDecimals: js.UndefOr[Boolean] = js.native
    
    var thousandsSeparator: js.UndefOr[String] = js.native
    
    var unit: js.UndefOr[Unit] = js.native
    
    var unitSeparator: js.UndefOr[String] = js.native
  }
  object BytesOptions {
    
    @scala.inline
    def apply(): BytesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BytesOptions]
    }
    
    @scala.inline
    implicit class BytesOptionsMutableBuilder[Self <: BytesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
      
      @scala.inline
      def setFixedDecimals(value: Boolean): Self = StObject.set(x, "fixedDecimals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedDecimalsUndefined: Self = StObject.set(x, "fixedDecimals", js.undefined)
      
      @scala.inline
      def setThousandsSeparator(value: String): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandsSeparatorUndefined: Self = StObject.set(x, "thousandsSeparator", js.undefined)
      
      @scala.inline
      def setUnit(value: Unit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitSeparator(value: String): Self = StObject.set(x, "unitSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitSeparatorUndefined: Self = StObject.set(x, "unitSeparator", js.undefined)
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bytes.bytesStrings.b_
    - typingsSlinky.bytes.bytesStrings.gb_
    - typingsSlinky.bytes.bytesStrings.kb_
    - typingsSlinky.bytes.bytesStrings.mb_
    - typingsSlinky.bytes.bytesStrings.pb_
    - typingsSlinky.bytes.bytesStrings.tb_
    - typingsSlinky.bytes.bytesStrings.B
    - typingsSlinky.bytes.bytesStrings.GB
    - typingsSlinky.bytes.bytesStrings.KB
    - typingsSlinky.bytes.bytesStrings.MB
    - typingsSlinky.bytes.bytesStrings.PB
    - typingsSlinky.bytes.bytesStrings.TB
  */
  trait Unit extends StObject
  object Unit {
    
    @scala.inline
    def B: typingsSlinky.bytes.bytesStrings.B = "B".asInstanceOf[typingsSlinky.bytes.bytesStrings.B]
    
    @scala.inline
    def GB: typingsSlinky.bytes.bytesStrings.GB = "GB".asInstanceOf[typingsSlinky.bytes.bytesStrings.GB]
    
    @scala.inline
    def KB: typingsSlinky.bytes.bytesStrings.KB = "KB".asInstanceOf[typingsSlinky.bytes.bytesStrings.KB]
    
    @scala.inline
    def MB: typingsSlinky.bytes.bytesStrings.MB = "MB".asInstanceOf[typingsSlinky.bytes.bytesStrings.MB]
    
    @scala.inline
    def PB: typingsSlinky.bytes.bytesStrings.PB = "PB".asInstanceOf[typingsSlinky.bytes.bytesStrings.PB]
    
    @scala.inline
    def TB: typingsSlinky.bytes.bytesStrings.TB = "TB".asInstanceOf[typingsSlinky.bytes.bytesStrings.TB]
    
    @scala.inline
    def b: b_ = "b".asInstanceOf[b_]
    
    @scala.inline
    def gb: gb_ = "gb".asInstanceOf[gb_]
    
    @scala.inline
    def kb: kb_ = "kb".asInstanceOf[kb_]
    
    @scala.inline
    def mb: mb_ = "mb".asInstanceOf[mb_]
    
    @scala.inline
    def pb: pb_ = "pb".asInstanceOf[pb_]
    
    @scala.inline
    def tb: tb_ = "tb".asInstanceOf[tb_]
  }
}
