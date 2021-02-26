package typingsSlinky.reservedWords

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reservedWords.reservedWordsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reserved-words", "KEYWORDS")
  @js.native
  val KEYWORDS_ : Keywords = js.native
  
  @JSImport("reserved-words", "check")
  @js.native
  def check(word: String): Boolean = js.native
  @JSImport("reserved-words", "check")
  @js.native
  def check(word: String, dialect: js.UndefOr[scala.Nothing], strict: Boolean): Boolean = js.native
  @JSImport("reserved-words", "check")
  @js.native
  def check(word: String, dialect: Dialect): Boolean = js.native
  @JSImport("reserved-words", "check")
  @js.native
  def check(word: String, dialect: Dialect, strict: Boolean): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reservedWords.reservedWordsNumbers.`3`
    - typingsSlinky.reservedWords.reservedWordsNumbers.`5`
    - typingsSlinky.reservedWords.reservedWordsNumbers.`6`
    - typingsSlinky.reservedWords.reservedWordsNumbers.`7`
    - typingsSlinky.reservedWords.reservedWordsStrings.es3
    - typingsSlinky.reservedWords.reservedWordsStrings.es5
    - typingsSlinky.reservedWords.reservedWordsStrings.es2015
    - typingsSlinky.reservedWords.reservedWordsStrings.es7
    - typingsSlinky.reservedWords.reservedWordsStrings.es6
    - typingsSlinky.reservedWords.reservedWordsStrings.next
  */
  trait Dialect extends StObject
  object Dialect {
    
    @scala.inline
    def `3`: typingsSlinky.reservedWords.reservedWordsNumbers.`3` = 3.asInstanceOf[typingsSlinky.reservedWords.reservedWordsNumbers.`3`]
    
    @scala.inline
    def `5`: typingsSlinky.reservedWords.reservedWordsNumbers.`5` = 5.asInstanceOf[typingsSlinky.reservedWords.reservedWordsNumbers.`5`]
    
    @scala.inline
    def `6`: typingsSlinky.reservedWords.reservedWordsNumbers.`6` = 6.asInstanceOf[typingsSlinky.reservedWords.reservedWordsNumbers.`6`]
    
    @scala.inline
    def `7`: typingsSlinky.reservedWords.reservedWordsNumbers.`7` = 7.asInstanceOf[typingsSlinky.reservedWords.reservedWordsNumbers.`7`]
    
    @scala.inline
    def es2015: typingsSlinky.reservedWords.reservedWordsStrings.es2015 = "es2015".asInstanceOf[typingsSlinky.reservedWords.reservedWordsStrings.es2015]
    
    @scala.inline
    def es3: typingsSlinky.reservedWords.reservedWordsStrings.es3 = "es3".asInstanceOf[typingsSlinky.reservedWords.reservedWordsStrings.es3]
    
    @scala.inline
    def es5: typingsSlinky.reservedWords.reservedWordsStrings.es5 = "es5".asInstanceOf[typingsSlinky.reservedWords.reservedWordsStrings.es5]
    
    @scala.inline
    def es6: typingsSlinky.reservedWords.reservedWordsStrings.es6 = "es6".asInstanceOf[typingsSlinky.reservedWords.reservedWordsStrings.es6]
    
    @scala.inline
    def es7: typingsSlinky.reservedWords.reservedWordsStrings.es7 = "es7".asInstanceOf[typingsSlinky.reservedWords.reservedWordsStrings.es7]
    
    @scala.inline
    def next: typingsSlinky.reservedWords.reservedWordsStrings.next = "next".asInstanceOf[typingsSlinky.reservedWords.reservedWordsStrings.next]
  }
  
  type Keywords = StringDictionary[StringDictionary[`true`]]
}
