package typingsSlinky.highlightJs

import typingsSlinky.highlightJs.highlightJsBooleans.`true`
import typingsSlinky.std.Record
import typingsSlinky.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<highlight.js.Mode, 'contains'> & {  contains :std.Array<highlight.js.CompiledMode>,   keywords :highlight.js.KeywordDict,   data :std.Record<string, any>,   terminator_end :string,   keywordPatternRe :std.RegExp,   beginRe :std.RegExp,   endRe :std.RegExp,   illegalRe :std.RegExp,   matcher :any,   compiled :true,   starts :highlight.js.CompiledMode | undefined,   parent :highlight.js.CompiledMode | undefined} */
@js.native
trait CompiledMode extends StObject {
  
  var __beforeBegin: js.UndefOr[js.Function] = js.native
  
  var begin: js.UndefOr[js.RegExp | String] = js.native
  
  var beginKeywords: js.UndefOr[String] = js.native
  
  var beginRe: js.RegExp = js.native
  
  var cached_variants: js.UndefOr[js.Array[Mode]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var compiled: js.UndefOr[Boolean] with `true` = js.native
  
  var contains: js.Array[CompiledMode] = js.native
  
  var data: Record[String, _] = js.native
  
  var end: js.UndefOr[js.RegExp | String] = js.native
  
  var endRe: js.RegExp = js.native
  
  var endSameAsBegin: js.UndefOr[Boolean] = js.native
  
  var endsParent: js.UndefOr[Boolean] = js.native
  
  var endsWithParent: js.UndefOr[Boolean] = js.native
  
  var excludeBegin: js.UndefOr[Boolean] = js.native
  
  var excludeEnd: js.UndefOr[Boolean] = js.native
  
  var illegal: js.UndefOr[String | js.RegExp] = js.native
  
  var illegalRe: js.RegExp = js.native
  
  var keywordPatternRe: js.RegExp = js.native
  
  var keywords: (js.UndefOr[(Record[String, _]) | String]) with KeywordDict = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var lexemes: js.UndefOr[String | js.RegExp] = js.native
  
  var matcher: js.Any = js.native
  
  @JSName("on:begin")
  var onColonbegin: js.UndefOr[ModeCallback] = js.native
  
  @JSName("on:end")
  var onColonend: js.UndefOr[js.Function] = js.native
  
  var parent: js.UndefOr[Mode] with js.UndefOr[CompiledMode] = js.native
  
  var relevance: js.UndefOr[Double] = js.native
  
  var returnBegin: js.UndefOr[Boolean] = js.native
  
  var returnEnd: js.UndefOr[Boolean] = js.native
  
  var skip: js.UndefOr[Boolean] = js.native
  
  var starts: js.UndefOr[Mode] with js.UndefOr[CompiledMode] = js.native
  
  var subLanguage: js.UndefOr[String | js.Array[String]] = js.native
  
  var terminator_end: String = js.native
  
  var variants: js.UndefOr[js.Array[Mode]] = js.native
}
object CompiledMode {
  
  @scala.inline
  def apply(
    beginRe: js.RegExp,
    compiled: js.UndefOr[Boolean] with `true`,
    contains: js.Array[CompiledMode],
    data: Record[String, _],
    endRe: js.RegExp,
    illegalRe: js.RegExp,
    keywordPatternRe: js.RegExp,
    keywords: (js.UndefOr[(Record[String, _]) | String]) with KeywordDict,
    matcher: js.Any,
    parent: js.UndefOr[Mode] with js.UndefOr[CompiledMode],
    starts: js.UndefOr[Mode] with js.UndefOr[CompiledMode],
    terminator_end: String
  ): CompiledMode = {
    val __obj = js.Dynamic.literal(beginRe = beginRe.asInstanceOf[js.Any], compiled = compiled.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], endRe = endRe.asInstanceOf[js.Any], illegalRe = illegalRe.asInstanceOf[js.Any], keywordPatternRe = keywordPatternRe.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], matcher = matcher.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], starts = starts.asInstanceOf[js.Any], terminator_end = terminator_end.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledMode]
  }
  
  @scala.inline
  implicit class CompiledModeMutableBuilder[Self <: CompiledMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: js.RegExp | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginKeywords(value: String): Self = StObject.set(x, "beginKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginKeywordsUndefined: Self = StObject.set(x, "beginKeywords", js.undefined)
    
    @scala.inline
    def setBeginRe(value: js.RegExp): Self = StObject.set(x, "beginRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginRegExp(value: js.RegExp): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    @scala.inline
    def setCached_variants(value: js.Array[Mode]): Self = StObject.set(x, "cached_variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCached_variantsUndefined: Self = StObject.set(x, "cached_variants", js.undefined)
    
    @scala.inline
    def setCached_variantsVarargs(value: Mode*): Self = StObject.set(x, "cached_variants", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCompiled(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: js.Array[CompiledMode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsVarargs(value: CompiledMode*): Self = StObject.set(x, "contains", js.Array(value :_*))
    
    @scala.inline
    def setData(value: Record[String, _]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: js.RegExp | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRe(value: js.RegExp): Self = StObject.set(x, "endRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRegExp(value: js.RegExp): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndSameAsBegin(value: Boolean): Self = StObject.set(x, "endSameAsBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndSameAsBeginUndefined: Self = StObject.set(x, "endSameAsBegin", js.undefined)
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setEndsParent(value: Boolean): Self = StObject.set(x, "endsParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndsParentUndefined: Self = StObject.set(x, "endsParent", js.undefined)
    
    @scala.inline
    def setEndsWithParent(value: Boolean): Self = StObject.set(x, "endsWithParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndsWithParentUndefined: Self = StObject.set(x, "endsWithParent", js.undefined)
    
    @scala.inline
    def setExcludeBegin(value: Boolean): Self = StObject.set(x, "excludeBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeBeginUndefined: Self = StObject.set(x, "excludeBegin", js.undefined)
    
    @scala.inline
    def setExcludeEnd(value: Boolean): Self = StObject.set(x, "excludeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeEndUndefined: Self = StObject.set(x, "excludeEnd", js.undefined)
    
    @scala.inline
    def setIllegal(value: String | js.RegExp): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIllegalRe(value: js.RegExp): Self = StObject.set(x, "illegalRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIllegalRegExp(value: js.RegExp): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIllegalUndefined: Self = StObject.set(x, "illegal", js.undefined)
    
    @scala.inline
    def setKeywordPatternRe(value: js.RegExp): Self = StObject.set(x, "keywordPatternRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: (js.UndefOr[(Record[String, _]) | String]) with KeywordDict): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLexemes(value: String | js.RegExp): Self = StObject.set(x, "lexemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexemesRegExp(value: js.RegExp): Self = StObject.set(x, "lexemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexemesUndefined: Self = StObject.set(x, "lexemes", js.undefined)
    
    @scala.inline
    def setMatcher(value: js.Any): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = StObject.set(x, "on:begin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnColonbeginUndefined: Self = StObject.set(x, "on:begin", js.undefined)
    
    @scala.inline
    def setOnColonend(value: js.Function): Self = StObject.set(x, "on:end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnColonendUndefined: Self = StObject.set(x, "on:end", js.undefined)
    
    @scala.inline
    def setParent(value: js.UndefOr[Mode] with js.UndefOr[CompiledMode]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
    
    @scala.inline
    def setReturnBegin(value: Boolean): Self = StObject.set(x, "returnBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnBeginUndefined: Self = StObject.set(x, "returnBegin", js.undefined)
    
    @scala.inline
    def setReturnEnd(value: Boolean): Self = StObject.set(x, "returnEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnEndUndefined: Self = StObject.set(x, "returnEnd", js.undefined)
    
    @scala.inline
    def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setStarts(value: js.UndefOr[Mode] with js.UndefOr[CompiledMode]): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLanguage(value: String | js.Array[String]): Self = StObject.set(x, "subLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLanguageUndefined: Self = StObject.set(x, "subLanguage", js.undefined)
    
    @scala.inline
    def setSubLanguageVarargs(value: String*): Self = StObject.set(x, "subLanguage", js.Array(value :_*))
    
    @scala.inline
    def setTerminator_end(value: String): Self = StObject.set(x, "terminator_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariants(value: js.Array[Mode]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: Mode*): Self = StObject.set(x, "variants", js.Array(value :_*))
    
    @scala.inline
    def set__beforeBegin(value: js.Function): Self = StObject.set(x, "__beforeBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__beforeBeginUndefined: Self = StObject.set(x, "__beforeBegin", js.undefined)
  }
}
