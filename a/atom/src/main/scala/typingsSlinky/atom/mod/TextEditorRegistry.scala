package typingsSlinky.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditorRegistry extends StObject {
  
  /** Register a TextEditor. */
  def add(editor: TextEditor): Disposable = js.native
  
  // Managing Text Editors
  /** Remove all editors from the registry. */
  def clear(): Unit = js.native
  
  /** Remove any grammar override that has been set for the given TextEditor. */
  def clearGrammarOverride(editor: TextEditor): Unit = js.native
  
  /**
    *  Retrieve the grammar scope name that has been set as a grammar override
    *  for the given TextEditor.
    */
  def getGrammarOverride(editor: TextEditor): String | Null = js.native
  
  /** Keep a TextEditor's configuration in sync with Atom's settings. */
  def maintainConfig(editor: TextEditor): Disposable = js.native
  
  /**
    *  Set a TextEditor's grammar based on its path and content, and continue
    *  to update its grammar as gramamrs are added or updated, or the editor's
    *  file path changes.
    */
  def maintainGrammar(editor: TextEditor): Disposable = js.native
  
  // Event Subscription
  /** Invoke the given callback with all the current and future registered TextEditors. */
  def observe(callback: js.Function1[/* editor */ TextEditor, Unit]): Disposable = js.native
  
  /** Remove the given TextEditor from the registry. */
  def remove(editor: TextEditor): Boolean = js.native
  
  /**
    *  Force a TextEditor to use a different grammar than the one that would
    *  otherwise be selected for it.
    */
  def setGrammarOverride(editor: TextEditor, scopeName: String): Unit = js.native
}
object TextEditorRegistry {
  
  @scala.inline
  def apply(
    add: TextEditor => Disposable,
    clear: () => Unit,
    clearGrammarOverride: TextEditor => Unit,
    getGrammarOverride: TextEditor => String | Null,
    maintainConfig: TextEditor => Disposable,
    maintainGrammar: TextEditor => Disposable,
    observe: js.Function1[/* editor */ TextEditor, Unit] => Disposable,
    remove: TextEditor => Boolean,
    setGrammarOverride: (TextEditor, String) => Unit
  ): TextEditorRegistry = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), clearGrammarOverride = js.Any.fromFunction1(clearGrammarOverride), getGrammarOverride = js.Any.fromFunction1(getGrammarOverride), maintainConfig = js.Any.fromFunction1(maintainConfig), maintainGrammar = js.Any.fromFunction1(maintainGrammar), observe = js.Any.fromFunction1(observe), remove = js.Any.fromFunction1(remove), setGrammarOverride = js.Any.fromFunction2(setGrammarOverride))
    __obj.asInstanceOf[TextEditorRegistry]
  }
  
  @scala.inline
  implicit class TextEditorRegistryMutableBuilder[Self <: TextEditorRegistry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: TextEditor => Disposable): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearGrammarOverride(value: TextEditor => Unit): Self = StObject.set(x, "clearGrammarOverride", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGrammarOverride(value: TextEditor => String | Null): Self = StObject.set(x, "getGrammarOverride", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaintainConfig(value: TextEditor => Disposable): Self = StObject.set(x, "maintainConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaintainGrammar(value: TextEditor => Disposable): Self = StObject.set(x, "maintainGrammar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObserve(value: js.Function1[/* editor */ TextEditor, Unit] => Disposable): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: TextEditor => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGrammarOverride(value: (TextEditor, String) => Unit): Self = StObject.set(x, "setGrammarOverride", js.Any.fromFunction2(value))
  }
}
