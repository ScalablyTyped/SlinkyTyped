package typingsSlinky.gatsbyCli

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMapMod {
  
  @js.native
  sealed trait ErrorCategory extends StObject
  @JSImport("gatsby-cli/lib/structured-errors/error-map", "ErrorCategory")
  @js.native
  object ErrorCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ErrorCategory with String] = js.native
    
    @js.native
    sealed trait SYSTEM extends ErrorCategory
    /* "SYSTEM" */ val SYSTEM: typingsSlinky.gatsbyCli.errorMapMod.ErrorCategory.SYSTEM with String = js.native
    
    @js.native
    sealed trait THIRD_PARTY extends ErrorCategory
    /* "THIRD_PARTY" */ val THIRD_PARTY: typingsSlinky.gatsbyCli.errorMapMod.ErrorCategory.THIRD_PARTY with String = js.native
    
    @js.native
    sealed trait USER extends ErrorCategory
    /* "USER" */ val USER: typingsSlinky.gatsbyCli.errorMapMod.ErrorCategory.USER with String = js.native
  }
  
  @JSImport("gatsby-cli/lib/structured-errors/error-map", "defaultError")
  @js.native
  val defaultError: IErrorMapEntry = js.native
  
  @JSImport("gatsby-cli/lib/structured-errors/error-map", "errorMap")
  @js.native
  val errorMap: Record[ErrorId, IErrorMapEntry] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.gatsbyCli.gatsbyCliStrings._empty
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`95312`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`95313`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`98123`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`98124`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85901`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85907`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85908`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85909`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85910`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85911`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85912`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85913`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85914`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85915`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85916`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85917`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85918`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85919`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85920`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85921`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85922`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85923`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85924`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85925`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85926`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`85927`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`10122`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`10123`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`10124`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`10125`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`10126`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`10226`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11321`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11322`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11323`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11324`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11325`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11326`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11327`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11328`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11329`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11330`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11331`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11467`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11521`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11522`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11610`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11611`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11612`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11613`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11614`
    - typingsSlinky.gatsbyCli.gatsbyCliStrings.`11701`
  */
  type ErrorId = _ErrorId | String
  
  @js.native
  trait IErrorMapEntry extends StObject {
    
    var category: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCategory * / any */ String
      ] = js.native
    
    var docsUrl: js.UndefOr[String] = js.native
    
    var level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Level * / any */ String = js.native
    
    def text(context: js.Any): String = js.native
    
    var `type`: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String
      ] = js.native
  }
  object IErrorMapEntry {
    
    @scala.inline
    def apply(
      level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Level * / any */ String,
      text: js.Any => String
    ): IErrorMapEntry = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
      __obj.asInstanceOf[IErrorMapEntry]
    }
    
    @scala.inline
    implicit class IErrorMapEntryMutableBuilder[Self <: IErrorMapEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCategory * / any */ String
      ): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocsUrlUndefined: Self = StObject.set(x, "docsUrl", js.undefined)
      
      @scala.inline
      def setLevel(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Level * / any */ String
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: js.Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait _ErrorId extends StObject
}
