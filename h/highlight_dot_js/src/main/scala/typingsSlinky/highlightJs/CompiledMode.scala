package typingsSlinky.highlightJs

import typingsSlinky.highlightJs.highlightJsBooleans.`true`
import typingsSlinky.std.Record
import typingsSlinky.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<highlight.js.Mode, 'contains'> & {  contains :std.Array<highlight.js.CompiledMode>,   keywords :highlight.js.KeywordDict,   data :std.Record<string, any>,   terminator_end :string,   keywordPatternRe :std.RegExp,   beginRe :std.RegExp,   endRe :std.RegExp,   illegalRe :std.RegExp,   matcher :any,   compiled :true,   starts :highlight.js.CompiledMode | undefined,   parent :highlight.js.CompiledMode | undefined} */
@js.native
trait CompiledMode extends js.Object {
  
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
  implicit class CompiledModeOps[Self <: CompiledMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeginRe(value: js.RegExp): Self = this.set("beginRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompiled(value: js.UndefOr[Boolean] with `true`): Self = this.set("compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsVarargs(value: CompiledMode*): Self = this.set("contains", js.Array(value :_*))
    
    @scala.inline
    def setContains(value: js.Array[CompiledMode]): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Record[String, _]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRe(value: js.RegExp): Self = this.set("endRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIllegalRe(value: js.RegExp): Self = this.set("illegalRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordPatternRe(value: js.RegExp): Self = this.set("keywordPatternRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: (js.UndefOr[(Record[String, _]) | String]) with KeywordDict): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatcher(value: js.Any): Self = this.set("matcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.UndefOr[Mode] with js.UndefOr[CompiledMode]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarts(value: js.UndefOr[Mode] with js.UndefOr[CompiledMode]): Self = this.set("starts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminator_end(value: String): Self = this.set("terminator_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__beforeBegin(value: js.Function): Self = this.set("__beforeBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__beforeBegin: Self = this.set("__beforeBegin", js.undefined)
    
    @scala.inline
    def setBeginRegExp(value: js.RegExp): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBegin(value: js.RegExp | String): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setBeginKeywords(value: String): Self = this.set("beginKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginKeywords: Self = this.set("beginKeywords", js.undefined)
    
    @scala.inline
    def setCached_variantsVarargs(value: Mode*): Self = this.set("cached_variants", js.Array(value :_*))
    
    @scala.inline
    def setCached_variants(value: js.Array[Mode]): Self = this.set("cached_variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCached_variants: Self = this.set("cached_variants", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setEndRegExp(value: js.RegExp): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: js.RegExp | String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setEndSameAsBegin(value: Boolean): Self = this.set("endSameAsBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndSameAsBegin: Self = this.set("endSameAsBegin", js.undefined)
    
    @scala.inline
    def setEndsParent(value: Boolean): Self = this.set("endsParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndsParent: Self = this.set("endsParent", js.undefined)
    
    @scala.inline
    def setEndsWithParent(value: Boolean): Self = this.set("endsWithParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndsWithParent: Self = this.set("endsWithParent", js.undefined)
    
    @scala.inline
    def setExcludeBegin(value: Boolean): Self = this.set("excludeBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeBegin: Self = this.set("excludeBegin", js.undefined)
    
    @scala.inline
    def setExcludeEnd(value: Boolean): Self = this.set("excludeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeEnd: Self = this.set("excludeEnd", js.undefined)
    
    @scala.inline
    def setIllegalRegExp(value: js.RegExp): Self = this.set("illegal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIllegal(value: String | js.RegExp): Self = this.set("illegal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIllegal: Self = this.set("illegal", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLexemesRegExp(value: js.RegExp): Self = this.set("lexemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexemes(value: String | js.RegExp): Self = this.set("lexemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLexemes: Self = this.set("lexemes", js.undefined)
    
    @scala.inline
    def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = this.set("on:begin", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColonbegin: Self = this.set("on:begin", js.undefined)
    
    @scala.inline
    def setOnColonend(value: js.Function): Self = this.set("on:end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnColonend: Self = this.set("on:end", js.undefined)
    
    @scala.inline
    def setRelevance(value: Double): Self = this.set("relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevance: Self = this.set("relevance", js.undefined)
    
    @scala.inline
    def setReturnBegin(value: Boolean): Self = this.set("returnBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnBegin: Self = this.set("returnBegin", js.undefined)
    
    @scala.inline
    def setReturnEnd(value: Boolean): Self = this.set("returnEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnEnd: Self = this.set("returnEnd", js.undefined)
    
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSubLanguageVarargs(value: String*): Self = this.set("subLanguage", js.Array(value :_*))
    
    @scala.inline
    def setSubLanguage(value: String | js.Array[String]): Self = this.set("subLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubLanguage: Self = this.set("subLanguage", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: Mode*): Self = this.set("variants", js.Array(value :_*))
    
    @scala.inline
    def setVariants(value: js.Array[Mode]): Self = this.set("variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
  }
}
