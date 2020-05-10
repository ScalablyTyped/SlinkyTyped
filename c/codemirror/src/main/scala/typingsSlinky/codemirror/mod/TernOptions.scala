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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TernOptions extends js.Object {
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
  var fileFilter: js.UndefOr[js.Function3[/* value */ String, /* docName */ String, /* doc */ Doc, String]] = js.native
  /**
    * Can be used to access files in
    * the project that haven't been loaded yet. Simply do callback(null) to
    * indicate that a file is not available.
    */
  var getFile: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* doc */ Doc | Null, _], _]
  ] = js.native
  /** An object mapping plugin names to configuration options. */
  var plugins: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any
  ] = js.native
  /** This function will be applied to the Tern responses before treating them */
  var responseFilter: js.UndefOr[
    js.Function5[
      /* doc */ Doc, 
      /* query */ Query, 
      /* request */ Document, 
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[
        RenameQueryResult | DocumentationQueryResult | FilesQueryResult | RefsQueryResult | TypeQueryResult | PropertiesQueryResult | DefinitionQueryResult | CompletionsQueryResult
      ], 
      _
    ]
  ] = js.native
  /** Can be used to override the way errors are displayed. */
  var showError: js.UndefOr[js.Function2[/* editor */ Editor, /* message */ js.Error, _]] = js.native
  /** This function should, when providing a multi-file view, switch the view or focus to the named file. */
  var switchToDoc: js.UndefOr[js.Function2[/* name */ String, /* doc */ Doc, _]] = js.native
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
  implicit class TernOptionsOps[Self <: TernOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionTip(value: /* data */ CompletionsQueryResult => String | HTMLElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionTip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompletionTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionTip")(js.undefined)
        ret
    }
    @scala.inline
    def withDefs(value: js.Array[Def]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defs")(js.undefined)
        ret
    }
    @scala.inline
    def withFileFilter(value: (/* value */ String, /* docName */ String, /* doc */ Doc) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFilter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFileFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFile(value: (/* name */ String, /* callback */ js.Function1[/* doc */ Doc | Null, _]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFile")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(
      value: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseFilter(
      value: (/* doc */ Doc, /* query */ Query, /* request */ Document, /* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[
          RenameQueryResult | DocumentationQueryResult | FilesQueryResult | RefsQueryResult | TypeQueryResult | PropertiesQueryResult | DefinitionQueryResult | CompletionsQueryResult
        ]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseFilter")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutResponseFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowError(value: (/* editor */ Editor, /* message */ js.Error) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShowError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showError")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchToDoc(value: (/* name */ String, /* doc */ Doc) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchToDoc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSwitchToDoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchToDoc")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeTip(value: /* data */ TypeQueryResult => String | HTMLElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeTip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTypeTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeTip")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerDeps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerDeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerDeps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerDeps")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerScript")(js.undefined)
        ret
    }
  }
  
}

