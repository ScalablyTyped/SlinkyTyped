package typingsSlinky.charsetDetector

import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * ICU based port of charset detection to javascript
    * @param input accept node Buffer, but will work with anything that follow such rules:
    *              - allow indexing by []
    *              - has .length
    *              - each numbered property is byte 0-255
    * @param matchers charset detectors, default value is `detect.DEFAULT_CS_RECOGNIZERS`
    * @returns array of matches sorted by most confident first
    */
  @JSImport("charset-detector", JSImport.Namespace)
  @js.native
  def apply(input: ArrayLike[Double]): js.Array[CharsetMatch] = js.native
  @JSImport("charset-detector", JSImport.Namespace)
  @js.native
  def apply(input: ArrayLike[Double], matchers: js.Array[CharsetMatcher]): js.Array[CharsetMatch] = js.native
  
  @JSImport("charset-detector", "ALL_CS_RECOGNIZERS")
  @js.native
  val ALL_CS_RECOGNIZERS: js.Array[CharsetMatcher] = js.native
  
  @JSImport("charset-detector", "DEFAULT_CS_RECOGNIZERS")
  @js.native
  val DEFAULT_CS_RECOGNIZERS: js.Array[CharsetMatcher] = js.native
  
  /**
    * charset detect match result
    */
  @js.native
  trait CharsetMatch extends StObject {
    
    /**
      * name of charset
      * @example 'UTF-8'
      */
    var charsetName: String = js.native
    
    /**
      * confidence between 0 and 100
      */
    var confidence: Double = js.native
    
    /**
      * language of charset
      * @example 'zh'
      */
    var lang: js.UndefOr[String] = js.native
  }
  object CharsetMatch {
    
    @scala.inline
    def apply(charsetName: String, confidence: Double): CharsetMatch = {
      val __obj = js.Dynamic.literal(charsetName = charsetName.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any])
      __obj.asInstanceOf[CharsetMatch]
    }
    
    @scala.inline
    implicit class CharsetMatchMutableBuilder[Self <: CharsetMatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharsetName(value: String): Self = StObject.set(x, "charsetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    }
  }
  
  type CharsetMatcher = js.Function2[/* input */ ArrayLike[Double], /* stats */ InputStats, CharsetMatch | Null]
  
  /**
    * input statics
    */
  @js.native
  trait InputStats extends StObject {
    
    /**
      * count of bytes, eg. `byteStats[32] === 17` means there are 17 bytes with value of `32` in the input
      */
    val byteStats: js.Array[Double] = js.native
    
    /**
      * whether input contains bytes larger that 0x7F (127)
      */
    val c1Bytes: Boolean = js.native
  }
  object InputStats {
    
    @scala.inline
    def apply(byteStats: js.Array[Double], c1Bytes: Boolean): InputStats = {
      val __obj = js.Dynamic.literal(byteStats = byteStats.asInstanceOf[js.Any], c1Bytes = c1Bytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputStats]
    }
    
    @scala.inline
    implicit class InputStatsMutableBuilder[Self <: InputStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByteStats(value: js.Array[Double]): Self = StObject.set(x, "byteStats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByteStatsVarargs(value: Double*): Self = StObject.set(x, "byteStats", js.Array(value :_*))
      
      @scala.inline
      def setC1Bytes(value: Boolean): Self = StObject.set(x, "c1Bytes", value.asInstanceOf[js.Any])
    }
  }
}
