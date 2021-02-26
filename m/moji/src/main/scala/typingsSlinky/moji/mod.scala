package typingsSlinky.moji

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moji", JSImport.Namespace)
  @js.native
  def apply(moji: String): Moji = js.native
  
  @JSImport("moji", "addMojisyu")
  @js.native
  def addMojisyu(`type`: String, mojisyu: MojisyuRange): Unit = js.native
  @JSImport("moji", "addMojisyu")
  @js.native
  def addMojisyu(`type`: String, mojisyu: MojisyuRegExp): Unit = js.native
  
  @js.native
  trait Moji extends StObject {
    
    def convert(beforeType: Mojisyu, afterType: Mojisyu): Moji = js.native
    
    def filter(`type`: Mojisyu): Moji = js.native
    
    def reject(`type`: Mojisyu): Moji = js.native
    
    def trim(): Moji = js.native
  }
  object Moji {
    
    @scala.inline
    def apply(
      convert: (Mojisyu, Mojisyu) => Moji,
      filter: Mojisyu => Moji,
      reject: Mojisyu => Moji,
      trim: () => Moji
    ): Moji = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), filter = js.Any.fromFunction1(filter), reject = js.Any.fromFunction1(reject), trim = js.Any.fromFunction0(trim))
      __obj.asInstanceOf[Moji]
    }
    
    @scala.inline
    implicit class MojiMutableBuilder[Self <: Moji] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvert(value: (Mojisyu, Mojisyu) => Moji): Self = StObject.set(x, "convert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilter(value: Mojisyu => Moji): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReject(value: Mojisyu => Moji): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrim(value: () => Moji): Self = StObject.set(x, "trim", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.moji.mojiStrings.ZE
    - typingsSlinky.moji.mojiStrings.HE
    - typingsSlinky.moji.mojiStrings.ZS
    - typingsSlinky.moji.mojiStrings.HS
    - typingsSlinky.moji.mojiStrings.HG
    - typingsSlinky.moji.mojiStrings.KK
    - typingsSlinky.moji.mojiStrings.ZK
    - typingsSlinky.moji.mojiStrings.HK
  */
  trait Mojisyu extends StObject
  object Mojisyu {
    
    @scala.inline
    def HE: typingsSlinky.moji.mojiStrings.HE = "HE".asInstanceOf[typingsSlinky.moji.mojiStrings.HE]
    
    @scala.inline
    def HG: typingsSlinky.moji.mojiStrings.HG = "HG".asInstanceOf[typingsSlinky.moji.mojiStrings.HG]
    
    @scala.inline
    def HK: typingsSlinky.moji.mojiStrings.HK = "HK".asInstanceOf[typingsSlinky.moji.mojiStrings.HK]
    
    @scala.inline
    def HS: typingsSlinky.moji.mojiStrings.HS = "HS".asInstanceOf[typingsSlinky.moji.mojiStrings.HS]
    
    @scala.inline
    def KK: typingsSlinky.moji.mojiStrings.KK = "KK".asInstanceOf[typingsSlinky.moji.mojiStrings.KK]
    
    @scala.inline
    def ZE: typingsSlinky.moji.mojiStrings.ZE = "ZE".asInstanceOf[typingsSlinky.moji.mojiStrings.ZE]
    
    @scala.inline
    def ZK: typingsSlinky.moji.mojiStrings.ZK = "ZK".asInstanceOf[typingsSlinky.moji.mojiStrings.ZK]
    
    @scala.inline
    def ZS: typingsSlinky.moji.mojiStrings.ZS = "ZS".asInstanceOf[typingsSlinky.moji.mojiStrings.ZS]
  }
  
  @js.native
  trait MojisyuRange extends StObject {
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object MojisyuRange {
    
    @scala.inline
    def apply(end: Double, start: Double): MojisyuRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[MojisyuRange]
    }
    
    @scala.inline
    implicit class MojisyuRangeMutableBuilder[Self <: MojisyuRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MojisyuRegExp extends StObject {
    
    var list: js.Array[String] = js.native
    
    var regexp: js.RegExp = js.native
  }
  object MojisyuRegExp {
    
    @scala.inline
    def apply(list: js.Array[String], regexp: js.RegExp): MojisyuRegExp = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MojisyuRegExp]
    }
    
    @scala.inline
    implicit class MojisyuRegExpMutableBuilder[Self <: MojisyuRegExp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setList(value: js.Array[String]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListVarargs(value: String*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setRegexp(value: js.RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
}
