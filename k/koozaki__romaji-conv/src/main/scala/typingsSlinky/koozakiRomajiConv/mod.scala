package typingsSlinky.koozakiRomajiConv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * RomajiConv のインスタンスを返す
    *
    * @param someString 変換対象の文字列
    * @return のインスタンス
    */
  @JSImport("@koozaki/romaji-conv", JSImport.Namespace)
  @js.native
  def apply(someString: String): RomajiConv = js.native
  
  /**
    * 変換後のひらがなを返す
    *
    * @param someString 変換対象の文字列
    * @return 変換後のひらがな
    */
  @JSImport("@koozaki/romaji-conv", "toHiragana")
  @js.native
  def toHiragana(someString: String): String = js.native
  
  /**
    * 変換後のカタカナを返す
    *
    * @param someString 変換対象の文字列
    * @return 変換後のカタカナ
    */
  @JSImport("@koozaki/romaji-conv", "toKatakana")
  @js.native
  def toKatakana(someString: String): String = js.native
  
  @js.native
  trait RomajiConv extends StObject {
    
    /**
      * 文字列の変換
      *
      * @param someString ローマ字 or ひらがな or カタカナ
      * @param mapObject マッピングオブジェクト
      * @return ひらがな or カタカナ
      */
    def convert(someString: String, mapObject: js.Object): String = js.native
    
    /**
      * 変換前の文字列を返す
      *
      * @return 変換前の文字列
      */
    def string(): String = js.native
    
    /**
      * 変換後のひらがなを返す
      *
      * @return 変換後のひらがな
      */
    def toHiragana(): String = js.native
    
    /**
      * 変換後のカタカナを返す
      *
      * @return 変換後のカタカナ
      */
    def toKatakana(): String = js.native
  }
  object RomajiConv {
    
    @scala.inline
    def apply(
      convert: (String, js.Object) => String,
      string: () => String,
      toHiragana: () => String,
      toKatakana: () => String
    ): RomajiConv = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), string = js.Any.fromFunction0(string), toHiragana = js.Any.fromFunction0(toHiragana), toKatakana = js.Any.fromFunction0(toKatakana))
      __obj.asInstanceOf[RomajiConv]
    }
    
    @scala.inline
    implicit class RomajiConvMutableBuilder[Self <: RomajiConv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvert(value: (String, js.Object) => String): Self = StObject.set(x, "convert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setString(value: () => String): Self = StObject.set(x, "string", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToHiragana(value: () => String): Self = StObject.set(x, "toHiragana", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToKatakana(value: () => String): Self = StObject.set(x, "toKatakana", js.Any.fromFunction0(value))
    }
  }
}
