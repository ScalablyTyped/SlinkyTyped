package typingsSlinky.inputmask

import typingsSlinky.inputmask.mod.Casing
import typingsSlinky.inputmask.mod.InputMode
import typingsSlinky.inputmask.mod.PositionCaretOnClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputmaskStrings {
  
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @scala.inline
  def getemptymask: getemptymask = "getemptymask".asInstanceOf[getemptymask]
  
  @scala.inline
  def getmetadata: getmetadata = "getmetadata".asInstanceOf[getmetadata]
  
  @scala.inline
  def hasMaskedValue: hasMaskedValue = "hasMaskedValue".asInstanceOf[hasMaskedValue]
  
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @scala.inline
  def isComplete: isComplete = "isComplete".asInstanceOf[isComplete]
  
  @scala.inline
  def isValid: isValid = "isValid".asInstanceOf[isValid]
  
  @scala.inline
  def lower: lower = "lower".asInstanceOf[lower]
  
  @scala.inline
  def lvp: lvp = "lvp".asInstanceOf[lvp]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @scala.inline
  def option: option = "option".asInstanceOf[option]
  
  @scala.inline
  def radixFocus: radixFocus = "radixFocus".asInstanceOf[radixFocus]
  
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @scala.inline
  def setValue: setValue = "setValue".asInstanceOf[setValue]
  
  @scala.inline
  def tel: tel = "tel".asInstanceOf[tel]
  
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @scala.inline
  def title: title = "title".asInstanceOf[title]
  
  @scala.inline
  def unmaskedvalue: unmaskedvalue = "unmaskedvalue".asInstanceOf[unmaskedvalue]
  
  @scala.inline
  def upper: upper = "upper".asInstanceOf[upper]
  
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  
  @scala.inline
  def verbatim: verbatim = "verbatim".asInstanceOf[verbatim]
  
  @js.native
  sealed trait decimal extends InputMode
  
  @js.native
  sealed trait email extends InputMode
  
  @js.native
  sealed trait getemptymask extends js.Object
  
  @js.native
  sealed trait getmetadata extends js.Object
  
  @js.native
  sealed trait hasMaskedValue extends js.Object
  
  @js.native
  sealed trait ignore extends PositionCaretOnClick
  
  @js.native
  sealed trait isComplete extends js.Object
  
  @js.native
  sealed trait isValid extends js.Object
  
  @js.native
  sealed trait lower extends Casing
  
  @js.native
  sealed trait lvp extends PositionCaretOnClick
  
  @js.native
  sealed trait none
    extends InputMode
       with PositionCaretOnClick
  
  @js.native
  sealed trait number extends js.Object
  
  @js.native
  sealed trait numeric extends InputMode
  
  @js.native
  sealed trait option extends js.Object
  
  @js.native
  sealed trait radixFocus extends PositionCaretOnClick
  
  @js.native
  sealed trait remove extends js.Object
  
  @js.native
  sealed trait search extends InputMode
  
  @js.native
  sealed trait select extends PositionCaretOnClick
  
  @js.native
  sealed trait setValue extends js.Object
  
  @js.native
  sealed trait tel extends InputMode
  
  @js.native
  sealed trait text extends InputMode
  
  @js.native
  sealed trait title extends Casing
  
  @js.native
  sealed trait unmaskedvalue extends js.Object
  
  @js.native
  sealed trait upper extends Casing
  
  @js.native
  sealed trait url extends InputMode
  
  @js.native
  sealed trait verbatim extends InputMode
}
