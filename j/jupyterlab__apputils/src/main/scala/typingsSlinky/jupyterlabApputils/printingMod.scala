package typingsSlinky.jupyterlabApputils

import typingsSlinky.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printingMod {
  
  object Printing {
    
    /**
      * Returns the print function for an object, or null if it does not provide a handler.
      */
    @JSImport("@jupyterlab/apputils/lib/printing", "Printing.getPrintFunction")
    @js.native
    def getPrintFunction(`val`: js.Any): OptionalAsyncThunk = js.native
    
    /**
      * Returns whether an object implements a print method.
      */
    @JSImport("@jupyterlab/apputils/lib/printing", "Printing.isPrintable")
    @js.native
    def isPrintable(a: js.Any): /* is @jupyterlab/apputils.@jupyterlab/apputils/lib/printing.Printing.IPrintable */ Boolean = js.native
    
    /**
      * Prints a URL by loading it into an iframe.
      *
      * @param url URL to load into an iframe.
      */
    @JSImport("@jupyterlab/apputils/lib/printing", "Printing.printURL")
    @js.native
    def printURL(url: String): js.Promise[Unit] = js.native
    
    /**
      * Prints a widget by copying it's DOM node
      * to a hidden iframe and printing that iframe.
      */
    @JSImport("@jupyterlab/apputils/lib/printing", "Printing.printWidget")
    @js.native
    def printWidget(widget: Widget): js.Promise[Unit] = js.native
    
    /**
      * Symbol to use for a method that returns a function to print an object.
      */
    @JSImport("@jupyterlab/apputils/lib/printing", "Printing.symbol")
    @js.native
    val symbol: js.Symbol = js.native
    
    /**
      * Objects who provide a custom way of printing themselves
      * should implement this interface.
      */
    @js.native
    trait IPrintable extends StObject
    
    /**
      * Function that takes no arguments and when invoked prints out some object or null if printing is not defined.
      */
    type OptionalAsyncThunk = js.Function0[js.Promise[Unit]] | Null
  }
}
