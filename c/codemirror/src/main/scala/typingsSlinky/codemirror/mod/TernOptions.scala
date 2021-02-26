package typingsSlinky.codemirror.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tern.ternMod.CompletionsQueryResult
import typingsSlinky.tern.ternMod.Def
import typingsSlinky.tern.ternMod.DefinitionQueryResult
import typingsSlinky.tern.ternMod.Document
import typingsSlinky.tern.ternMod.DocumentationQueryResult
import typingsSlinky.tern.ternMod.FilesQueryResult
import typingsSlinky.tern.ternMod.PropertiesQueryResult
import typingsSlinky.tern.ternMod.Query
import typingsSlinky.tern.ternMod.RefsQueryResult
import typingsSlinky.tern.ternMod.RenameQueryResult
import typingsSlinky.tern.ternMod.TypeQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TernOptions extends StObject {
  
  /**
    * Customize the content in tooltips for completions.
    * Is passed a single argument — the completion's data as returned by
    * Tern — and may return a string, DOM node, or null to indicate that
    * no tip should be shown. By default the docstring is shown.
    */
  var completionTip: js.UndefOr[js.Function1[/* data */ CompletionsQueryResult, String | HTMLElement | Null]] = js.native
  
  /** An array of JSON definition data structures. */
  var defs: js.UndefOr[js.Array[Def]] = js.native
  
  /**
    * This function will be applied
    * to documents before passing them on to Tern.
    */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* docName */ String, 
      /* doc */ typingsSlinky.codemirror.mod.Doc, 
      String
    ]
  ] = js.native
  
  /**
    * Can be used to access files in
    * the project that haven't been loaded yet. Simply do callback(null) to
    * indicate that a file is not available.
    */
  var getFile: js.UndefOr[
    js.Function2[
      /* name */ String, 
      /* callback */ js.Function1[/* doc */ typingsSlinky.codemirror.mod.Doc | Null, _], 
      _
    ]
  ] = js.native
  
  /** An object mapping plugin names to configuration options. */
  var plugins: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any
  ] = js.native
  
  /** This function will be applied to the Tern responses before treating them */
  var responseFilter: js.UndefOr[
    js.Function5[
      /* doc */ typingsSlinky.codemirror.mod.Doc, 
      /* query */ Query, 
      /* request */ Document, 
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[
        RefsQueryResult | DefinitionQueryResult | DocumentationQueryResult | FilesQueryResult | PropertiesQueryResult | CompletionsQueryResult | TypeQueryResult | RenameQueryResult
      ], 
      _
    ]
  ] = js.native
  
  /** Can be used to override the way errors are displayed. */
  var showError: js.UndefOr[js.Function2[/* editor */ Editor, /* message */ js.Error, _]] = js.native
  
  /** This function should, when providing a multi-file view, switch the view or focus to the named file. */
  var switchToDoc: js.UndefOr[js.Function2[/* name */ String, /* doc */ typingsSlinky.codemirror.mod.Doc, _]] = js.native
  
  /** Like completionTip, but for the tooltips shown for type queries. */
  var typeTip: js.UndefOr[js.Function1[/* data */ TypeQueryResult, String | HTMLElement | Null]] = js.native
  
  /**
    * Set to true to enable web worker mode. You'll probably
    * want to feature detect the actual value you use here, for example
    * !!window.Worker.
    */
  var useWorker: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of paths pointing (relative to workerScript)
    * to the Acorn and Tern libraries and any Tern plugins you want to
    * load. Or, if you minified those into a single script and included
    * them in the workerScript, simply leave this undefined.
    */
  var workerDeps: js.UndefOr[js.Array[String]] = js.native
  
  /** The main script of the worker. Point this to wherever you are hosting worker.js from this directory. */
  var workerScript: js.UndefOr[String] = js.native
}
object TernOptions {
  
  @scala.inline
  def apply(): TernOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TernOptions]
  }
  
  @scala.inline
  implicit class TernOptionsMutableBuilder[Self <: TernOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionTip(value: /* data */ CompletionsQueryResult => String | HTMLElement | Null): Self = StObject.set(x, "completionTip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompletionTipUndefined: Self = StObject.set(x, "completionTip", js.undefined)
    
    @scala.inline
    def setDefs(value: js.Array[Def]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
    
    @scala.inline
    def setDefsVarargs(value: Def*): Self = StObject.set(x, "defs", js.Array(value :_*))
    
    @scala.inline
    def setFileFilter(
      value: (/* value */ String, /* docName */ String, /* doc */ typingsSlinky.codemirror.mod.Doc) => String
    ): Self = StObject.set(x, "fileFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFileFilterUndefined: Self = StObject.set(x, "fileFilter", js.undefined)
    
    @scala.inline
    def setGetFile(
      value: (/* name */ String, /* callback */ js.Function1[/* doc */ typingsSlinky.codemirror.mod.Doc | Null, _]) => _
    ): Self = StObject.set(x, "getFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFileUndefined: Self = StObject.set(x, "getFile", js.undefined)
    
    @scala.inline
    def setPlugins(
      value: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any
    ): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setResponseFilter(
      value: (/* doc */ typingsSlinky.codemirror.mod.Doc, /* query */ Query, /* request */ Document, /* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[
          RefsQueryResult | DefinitionQueryResult | DocumentationQueryResult | FilesQueryResult | PropertiesQueryResult | CompletionsQueryResult | TypeQueryResult | RenameQueryResult
        ]) => _
    ): Self = StObject.set(x, "responseFilter", js.Any.fromFunction5(value))
    
    @scala.inline
    def setResponseFilterUndefined: Self = StObject.set(x, "responseFilter", js.undefined)
    
    @scala.inline
    def setShowError(value: (/* editor */ Editor, /* message */ js.Error) => _): Self = StObject.set(x, "showError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowErrorUndefined: Self = StObject.set(x, "showError", js.undefined)
    
    @scala.inline
    def setSwitchToDoc(value: (/* name */ String, /* doc */ typingsSlinky.codemirror.mod.Doc) => _): Self = StObject.set(x, "switchToDoc", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSwitchToDocUndefined: Self = StObject.set(x, "switchToDoc", js.undefined)
    
    @scala.inline
    def setTypeTip(value: /* data */ TypeQueryResult => String | HTMLElement | Null): Self = StObject.set(x, "typeTip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTypeTipUndefined: Self = StObject.set(x, "typeTip", js.undefined)
    
    @scala.inline
    def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseWorkerUndefined: Self = StObject.set(x, "useWorker", js.undefined)
    
    @scala.inline
    def setWorkerDeps(value: js.Array[String]): Self = StObject.set(x, "workerDeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerDepsUndefined: Self = StObject.set(x, "workerDeps", js.undefined)
    
    @scala.inline
    def setWorkerDepsVarargs(value: String*): Self = StObject.set(x, "workerDeps", js.Array(value :_*))
    
    @scala.inline
    def setWorkerScript(value: String): Self = StObject.set(x, "workerScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerScriptUndefined: Self = StObject.set(x, "workerScript", js.undefined)
  }
}
