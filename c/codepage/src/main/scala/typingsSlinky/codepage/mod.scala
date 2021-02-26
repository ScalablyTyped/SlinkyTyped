package typingsSlinky.codepage

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("codepage", JSImport.Default)
  @js.native
  val default: CPModule = js.native
  
  @JSImport("codepage", "cptable")
  @js.native
  val cptable: CPModule = js.native
  
  @js.native
  trait CPConv extends StObject {
    
    var dec: NumberDictionary[String] = js.native
    
    var enc: StringDictionary[Double] = js.native
  }
  object CPConv {
    
    @scala.inline
    def apply(dec: NumberDictionary[String], enc: StringDictionary[Double]): CPConv = {
      val __obj = js.Dynamic.literal(dec = dec.asInstanceOf[js.Any], enc = enc.asInstanceOf[js.Any])
      __obj.asInstanceOf[CPConv]
    }
    
    @scala.inline
    implicit class CPConvMutableBuilder[Self <: CPConv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDec(value: NumberDictionary[String]): Self = StObject.set(x, "dec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnc(value: StringDictionary[Double]): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
    }
  }
  
  type CPData = String | js.Array[Double] | js.typedarray.Uint8Array
  
  type CPIndex = Double | String
  
  @js.native
  trait CPModule extends /** Codepage Converters */
  /* cp */ NumberDictionary[CPConv] {
    
    /** Utility Functions */
    var utils: CPUtils = js.native
    
    /** Version string */
    var version: String = js.native
  }
  object CPModule {
    
    @scala.inline
    def apply(utils: CPUtils, version: String): CPModule = {
      val __obj = js.Dynamic.literal(utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CPModule]
    }
    
    @scala.inline
    implicit class CPModuleMutableBuilder[Self <: CPModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUtils(value: CPUtils): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type CPString = String | js.Array[String] | js.typedarray.Uint8Array
  
  @js.native
  trait CPUtils extends StObject {
    
    def decode(cp: CPIndex, data: CPData): String = js.native
    
    def encode(cp: CPIndex, data: CPString): CPData = js.native
    def encode(cp: CPIndex, data: CPString, opts: js.Any): CPData = js.native
    
    def hascp(n: Double): Boolean = js.native
    
    var magic: StringDictionary[String] = js.native
  }
  
  type _To = CPModule
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: CPModule = default
}
