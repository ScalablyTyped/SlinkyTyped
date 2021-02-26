package typingsSlinky.gatsbyCli

import slinky.core.facade.ReactElement
import typingsSlinky.gatsbyCli.typesMod.IGatsbyCLIState
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ErrorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/cli", JSImport.Default)
  @js.native
  class default () extends CLI
  object default {
    
    /* static member */
    @JSImport("gatsby-cli/lib/reporter/loggers/ink/cli", "default.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError(error: js.Error): ICLIState = js.native
  }
  
  @js.native
  trait CLI
    extends Component[ICLIProps, ICLIState, js.Any] {
    
    @JSName("componentDidCatch")
    def componentDidCatch_MCLI(error: js.Error, info: ErrorInfo): Unit = js.native
    
    var memoizedReactElementsForMessages: js.Array[ReactElement] = js.native
  }
  
  @js.native
  trait ICLIProps extends StObject {
    
    var logs: IGatsbyCLIState = js.native
    
    var showStatusBar: Boolean = js.native
  }
  object ICLIProps {
    
    @scala.inline
    def apply(logs: IGatsbyCLIState, showStatusBar: Boolean): ICLIProps = {
      val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], showStatusBar = showStatusBar.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICLIProps]
    }
    
    @scala.inline
    implicit class ICLIPropsMutableBuilder[Self <: ICLIProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogs(value: IGatsbyCLIState): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStatusBar(value: Boolean): Self = StObject.set(x, "showStatusBar", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICLIState extends StObject {
    
    var error: js.UndefOr[js.Error] = js.native
    
    var hasError: Boolean = js.native
  }
  object ICLIState {
    
    @scala.inline
    def apply(hasError: Boolean): ICLIState = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICLIState]
    }
    
    @scala.inline
    implicit class ICLIStateMutableBuilder[Self <: ICLIState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    }
  }
}
