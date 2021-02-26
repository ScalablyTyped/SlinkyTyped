package typingsSlinky.ecmarkup

import typingsSlinky.ecmarkup.ecmarkupStrings.`inline`
import typingsSlinky.ecmarkup.ecmarkupStrings.draft
import typingsSlinky.ecmarkup.ecmarkupStrings.external
import typingsSlinky.ecmarkup.ecmarkupStrings.none
import typingsSlinky.ecmarkup.ecmarkupStrings.proposal
import typingsSlinky.ecmarkup.ecmarkupStrings.standard
import typingsSlinky.ecmarkup.specMod.Spec
import typingsSlinky.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ecmarkup", "Boilerplate")
  @js.native
  class Boilerplate () extends StObject {
    
    var address: js.UndefOr[String] = js.native
    
    var copyright: js.UndefOr[String] = js.native
    
    var license: js.UndefOr[String] = js.native
  }
  
  @JSImport("ecmarkup", "build")
  @js.native
  def build(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, js.Thenable[String]]
  ): js.Promise[Spec] = js.native
  @JSImport("ecmarkup", "build")
  @js.native
  def build(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, js.Thenable[String]],
    opts: js.UndefOr[scala.Nothing],
    token: CancellationToken
  ): js.Promise[Spec] = js.native
  @JSImport("ecmarkup", "build")
  @js.native
  def build(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, js.Thenable[String]],
    opts: Options
  ): js.Promise[Spec] = js.native
  @JSImport("ecmarkup", "build")
  @js.native
  def build(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, js.Thenable[String]],
    opts: Options,
    token: CancellationToken
  ): js.Promise[Spec] = js.native
  
  @js.native
  trait EcmarkupError extends StObject {
    
    var column: js.UndefOr[Double] = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var line: js.UndefOr[Double] = js.native
    
    var message: String = js.native
    
    var nodeType: js.UndefOr[String] = js.native
    
    var ruleId: String = js.native
    
    var source: js.UndefOr[String] = js.native
  }
  object EcmarkupError {
    
    @scala.inline
    def apply(message: String, ruleId: String): EcmarkupError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EcmarkupError]
    }
    
    @scala.inline
    implicit class EcmarkupErrorMutableBuilder[Self <: EcmarkupError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      @scala.inline
      def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var assets: js.UndefOr[none | `inline` | external] = js.native
    
    var boilerplate: js.UndefOr[Boilerplate] = js.native
    
    var contributors: js.UndefOr[String] = js.native
    
    var copyright: js.UndefOr[Boolean] = js.native
    
    var cssOut: js.UndefOr[String] = js.native
    
    var date: js.UndefOr[js.Date] = js.native
    
    var ecma262Biblio: js.UndefOr[Boolean] = js.native
    
    var jsOut: js.UndefOr[String] = js.native
    
    var lintSpec: js.UndefOr[Boolean] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var log: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
    
    var oldToc: js.UndefOr[Boolean] = js.native
    
    var outfile: js.UndefOr[String] = js.native
    
    var shortname: js.UndefOr[String] = js.native
    
    var stage: js.UndefOr[String | Null] = js.native
    
    var status: js.UndefOr[proposal | draft | standard] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var toc: js.UndefOr[Boolean] = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var warn: js.UndefOr[js.Function1[/* err */ EcmarkupError, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssets(value: none | `inline` | external): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
      
      @scala.inline
      def setBoilerplate(value: Boilerplate): Self = StObject.set(x, "boilerplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoilerplateUndefined: Self = StObject.set(x, "boilerplate", js.undefined)
      
      @scala.inline
      def setContributors(value: String): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      @scala.inline
      def setCopyright(value: Boolean): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setCssOut(value: String): Self = StObject.set(x, "cssOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssOutUndefined: Self = StObject.set(x, "cssOut", js.undefined)
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setEcma262Biblio(value: Boolean): Self = StObject.set(x, "ecma262Biblio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcma262BiblioUndefined: Self = StObject.set(x, "ecma262Biblio", js.undefined)
      
      @scala.inline
      def setJsOut(value: String): Self = StObject.set(x, "jsOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsOutUndefined: Self = StObject.set(x, "jsOut", js.undefined)
      
      @scala.inline
      def setLintSpec(value: Boolean): Self = StObject.set(x, "lintSpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLintSpecUndefined: Self = StObject.set(x, "lintSpec", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setLog(value: /* msg */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setOldToc(value: Boolean): Self = StObject.set(x, "oldToc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldTocUndefined: Self = StObject.set(x, "oldToc", js.undefined)
      
      @scala.inline
      def setOutfile(value: String): Self = StObject.set(x, "outfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutfileUndefined: Self = StObject.set(x, "outfile", js.undefined)
      
      @scala.inline
      def setShortname(value: String): Self = StObject.set(x, "shortname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortnameUndefined: Self = StObject.set(x, "shortname", js.undefined)
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageNull: Self = StObject.set(x, "stage", null)
      
      @scala.inline
      def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
      
      @scala.inline
      def setStatus(value: proposal | draft | standard): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToc(value: Boolean): Self = StObject.set(x, "toc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTocUndefined: Self = StObject.set(x, "toc", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWarn(value: /* err */ EcmarkupError => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
