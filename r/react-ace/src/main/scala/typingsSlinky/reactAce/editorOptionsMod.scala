package typingsSlinky.reactAce

import typingsSlinky.reactAce.anon.TypeofAceBuilds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorOptionsMod {
  
  @JSImport("react-ace/lib/editorOptions", "debounce")
  @js.native
  def debounce(fn: js.Function1[/* repeated */ js.Any, Unit], delay: Double): js.Function0[Unit] = js.native
  
  @JSImport("react-ace/lib/editorOptions", "editorEvents")
  @js.native
  val editorEvents: js.Array[EditorEvent] = js.native
  
  @JSImport("react-ace/lib/editorOptions", "editorOptions")
  @js.native
  val editorOptions: js.Array[EditorOption] = js.native
  
  @JSImport("react-ace/lib/editorOptions", "getAceInstance")
  @js.native
  def getAceInstance(): TypeofAceBuilds = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactAce.reactAceStrings.onChange
    - typingsSlinky.reactAce.reactAceStrings.onFocus
    - typingsSlinky.reactAce.reactAceStrings.onInput
    - typingsSlinky.reactAce.reactAceStrings.onBlur
    - typingsSlinky.reactAce.reactAceStrings.onCopy
    - typingsSlinky.reactAce.reactAceStrings.onPaste
    - typingsSlinky.reactAce.reactAceStrings.onSelectionChange
    - typingsSlinky.reactAce.reactAceStrings.onCursorChange
    - typingsSlinky.reactAce.reactAceStrings.onScroll
    - typingsSlinky.reactAce.reactAceStrings.handleOptions
    - typingsSlinky.reactAce.reactAceStrings.updateRef
  */
  trait EditorEvent extends StObject
  object EditorEvent {
    
    @scala.inline
    def handleOptions: typingsSlinky.reactAce.reactAceStrings.handleOptions = "handleOptions".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.handleOptions]
    
    @scala.inline
    def onBlur: typingsSlinky.reactAce.reactAceStrings.onBlur = "onBlur".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.onBlur]
    
    @scala.inline
    def onChange: typingsSlinky.reactAce.reactAceStrings.onChange = "onChange".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.onChange]
    
    @scala.inline
    def onCopy: typingsSlinky.reactAce.reactAceStrings.onCopy = "onCopy".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.onCopy]
    
    @scala.inline
    def onCursorChange: typingsSlinky.reactAce.reactAceStrings.onCursorChange = "onCursorChange".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.onCursorChange]
    
    @scala.inline
    def onFocus: typingsSlinky.reactAce.reactAceStrings.onFocus = "onFocus".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.onFocus]
    
    @scala.inline
    def onInput: typingsSlinky.reactAce.reactAceStrings.onInput = "onInput".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.onInput]
    
    @scala.inline
    def onPaste: typingsSlinky.reactAce.reactAceStrings.onPaste = "onPaste".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.onPaste]
    
    @scala.inline
    def onScroll: typingsSlinky.reactAce.reactAceStrings.onScroll = "onScroll".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.onScroll]
    
    @scala.inline
    def onSelectionChange: typingsSlinky.reactAce.reactAceStrings.onSelectionChange = "onSelectionChange".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.onSelectionChange]
    
    @scala.inline
    def updateRef: typingsSlinky.reactAce.reactAceStrings.updateRef = "updateRef".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.updateRef]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactAce.reactAceStrings.minLines
    - typingsSlinky.reactAce.reactAceStrings.maxLines
    - typingsSlinky.reactAce.reactAceStrings.readOnly
    - typingsSlinky.reactAce.reactAceStrings.highlightActiveLine
    - typingsSlinky.reactAce.reactAceStrings.tabSize
    - typingsSlinky.reactAce.reactAceStrings.enableBasicAutocompletion
    - typingsSlinky.reactAce.reactAceStrings.enableLiveAutocompletion
    - typingsSlinky.reactAce.reactAceStrings.enableSnippets
  */
  trait EditorOption extends StObject
  object EditorOption {
    
    @scala.inline
    def enableBasicAutocompletion: typingsSlinky.reactAce.reactAceStrings.enableBasicAutocompletion = "enableBasicAutocompletion".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.enableBasicAutocompletion]
    
    @scala.inline
    def enableLiveAutocompletion: typingsSlinky.reactAce.reactAceStrings.enableLiveAutocompletion = "enableLiveAutocompletion".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.enableLiveAutocompletion]
    
    @scala.inline
    def enableSnippets: typingsSlinky.reactAce.reactAceStrings.enableSnippets = "enableSnippets".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.enableSnippets]
    
    @scala.inline
    def highlightActiveLine: typingsSlinky.reactAce.reactAceStrings.highlightActiveLine = "highlightActiveLine".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.highlightActiveLine]
    
    @scala.inline
    def maxLines: typingsSlinky.reactAce.reactAceStrings.maxLines = "maxLines".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.maxLines]
    
    @scala.inline
    def minLines: typingsSlinky.reactAce.reactAceStrings.minLines = "minLines".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.minLines]
    
    @scala.inline
    def readOnly: typingsSlinky.reactAce.reactAceStrings.readOnly = "readOnly".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.readOnly]
    
    @scala.inline
    def tabSize: typingsSlinky.reactAce.reactAceStrings.tabSize = "tabSize".asInstanceOf[typingsSlinky.reactAce.reactAceStrings.tabSize]
  }
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait Global extends StObject {
        
        var window: js.Any = js.native
      }
      object Global {
        
        @scala.inline
        def apply(window: js.Any): Global = {
          val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
          __obj.asInstanceOf[Global]
        }
        
        @scala.inline
        implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setWindow(value: js.Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
