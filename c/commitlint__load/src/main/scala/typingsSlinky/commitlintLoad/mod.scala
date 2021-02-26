package typingsSlinky.commitlintLoad

import typingsSlinky.commitlintLoad.commitlintLoadNumbers.`0`
import typingsSlinky.commitlintLoad.commitlintLoadNumbers.`1`
import typingsSlinky.commitlintLoad.commitlintLoadNumbers.`2`
import typingsSlinky.commitlintLoad.commitlintLoadStrings.lowercase_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@commitlint/load", JSImport.Default)
  @js.native
  def default(): js.Promise[CommitlintConfig] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.always
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.never
  */
  trait Applicability extends StObject
  object Applicability {
    
    @scala.inline
    def always: typingsSlinky.commitlintLoad.commitlintLoadStrings.always = "always".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.always]
    
    @scala.inline
    def never: typingsSlinky.commitlintLoad.commitlintLoadStrings.never = "never".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.never]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.`lower-case`
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.lowercase_
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.lowerCase
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.`upper-case`
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.uppercase
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.`camel-case`
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.`kebab-case`
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.`pascal-case`
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.`sentence-case`
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.sentencecase
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.`start-case`
    - typingsSlinky.commitlintLoad.commitlintLoadStrings.`snake-case`
  */
  trait Case extends StObject
  object Case {
    
    @scala.inline
    def `camel-case`: typingsSlinky.commitlintLoad.commitlintLoadStrings.`camel-case` = "camel-case".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.`camel-case`]
    
    @scala.inline
    def `kebab-case`: typingsSlinky.commitlintLoad.commitlintLoadStrings.`kebab-case` = "kebab-case".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.`kebab-case`]
    
    @scala.inline
    def `lower-case`: typingsSlinky.commitlintLoad.commitlintLoadStrings.`lower-case` = "lower-case".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.`lower-case`]
    
    @scala.inline
    def lowerCase: typingsSlinky.commitlintLoad.commitlintLoadStrings.lowerCase = "lowerCase".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.lowerCase]
    
    @scala.inline
    def lowercase: lowercase_ = "lowercase".asInstanceOf[lowercase_]
    
    @scala.inline
    def `pascal-case`: typingsSlinky.commitlintLoad.commitlintLoadStrings.`pascal-case` = "pascal-case".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.`pascal-case`]
    
    @scala.inline
    def `sentence-case`: typingsSlinky.commitlintLoad.commitlintLoadStrings.`sentence-case` = "sentence-case".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.`sentence-case`]
    
    @scala.inline
    def sentencecase: typingsSlinky.commitlintLoad.commitlintLoadStrings.sentencecase = "sentencecase".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.sentencecase]
    
    @scala.inline
    def `snake-case`: typingsSlinky.commitlintLoad.commitlintLoadStrings.`snake-case` = "snake-case".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.`snake-case`]
    
    @scala.inline
    def `start-case`: typingsSlinky.commitlintLoad.commitlintLoadStrings.`start-case` = "start-case".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.`start-case`]
    
    @scala.inline
    def `upper-case`: typingsSlinky.commitlintLoad.commitlintLoadStrings.`upper-case` = "upper-case".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.`upper-case`]
    
    @scala.inline
    def uppercase: typingsSlinky.commitlintLoad.commitlintLoadStrings.uppercase = "uppercase".asInstanceOf[typingsSlinky.commitlintLoad.commitlintLoadStrings.uppercase]
  }
  
  @js.native
  trait CommitlintConfig extends StObject {
    
    var `extends`: js.UndefOr[js.Array[String]] = js.native
    
    var rules: Rules = js.native
  }
  object CommitlintConfig {
    
    @scala.inline
    def apply(rules: Rules): CommitlintConfig = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitlintConfig]
    }
    
    @scala.inline
    implicit class CommitlintConfigMutableBuilder[Self <: CommitlintConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtends(value: js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      @scala.inline
      def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      @scala.inline
      def setRules(value: Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.commitlintLoad.commitlintLoadNumbers.`0`
    - typingsSlinky.commitlintLoad.commitlintLoadNumbers.`1`
    - typingsSlinky.commitlintLoad.commitlintLoadNumbers.`2`
  */
  trait Level extends StObject
  object Level {
    
    @scala.inline
    def Disable: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def Error: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Warn: `1` = 1.asInstanceOf[`1`]
  }
  
  type Rule[T] = js.Tuple3[Level | `0` | `1` | `2`, Applicability, T]
  
  @js.native
  trait Rules extends StObject {
    
    var `body-leading-blank`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
    
    var `body-max-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `body-max-line-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `body-min-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `footer-leading-blank`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
    
    var `footer-max-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `footer-max-line-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `footer-min-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `header-case`: js.UndefOr[Rule[Case]] = js.native
    
    var `header-full-stop`: js.UndefOr[Rule[String]] = js.native
    
    var `header-max-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `header-min-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `references-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
    
    var `scope-case`: js.UndefOr[Rule[Case]] = js.native
    
    var `scope-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
    
    var `scope-enum`: js.UndefOr[Rule[js.Array[String]]] = js.native
    
    var `scope-max-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `scope-min-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `signed-off-by`: js.UndefOr[Rule[String]] = js.native
    
    var `subject-case`: js.UndefOr[Rule[Case | js.Array[Case]]] = js.native
    
    var `subject-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
    
    var `subject-full-stop`: js.UndefOr[Rule[String]] = js.native
    
    var `subject-max-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `subject-min-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `type-case`: js.UndefOr[Rule[Case]] = js.native
    
    var `type-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
    
    var `type-enum`: js.UndefOr[Rule[js.Array[String]]] = js.native
    
    var `type-max-length`: js.UndefOr[Rule[Double]] = js.native
    
    var `type-min-length`: js.UndefOr[Rule[Double]] = js.native
  }
  object Rules {
    
    @scala.inline
    def apply(): Rules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rules]
    }
    
    @scala.inline
    implicit class RulesMutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setBody-leading-blank`(value: Rule[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "body-leading-blank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBody-leading-blankUndefined`: Self = StObject.set(x, "body-leading-blank", js.undefined)
      
      @scala.inline
      def `setBody-max-length`(value: Rule[Double]): Self = StObject.set(x, "body-max-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBody-max-lengthUndefined`: Self = StObject.set(x, "body-max-length", js.undefined)
      
      @scala.inline
      def `setBody-max-line-length`(value: Rule[Double]): Self = StObject.set(x, "body-max-line-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBody-max-line-lengthUndefined`: Self = StObject.set(x, "body-max-line-length", js.undefined)
      
      @scala.inline
      def `setBody-min-length`(value: Rule[Double]): Self = StObject.set(x, "body-min-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBody-min-lengthUndefined`: Self = StObject.set(x, "body-min-length", js.undefined)
      
      @scala.inline
      def `setFooter-leading-blank`(value: Rule[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "footer-leading-blank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFooter-leading-blankUndefined`: Self = StObject.set(x, "footer-leading-blank", js.undefined)
      
      @scala.inline
      def `setFooter-max-length`(value: Rule[Double]): Self = StObject.set(x, "footer-max-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFooter-max-lengthUndefined`: Self = StObject.set(x, "footer-max-length", js.undefined)
      
      @scala.inline
      def `setFooter-max-line-length`(value: Rule[Double]): Self = StObject.set(x, "footer-max-line-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFooter-max-line-lengthUndefined`: Self = StObject.set(x, "footer-max-line-length", js.undefined)
      
      @scala.inline
      def `setFooter-min-length`(value: Rule[Double]): Self = StObject.set(x, "footer-min-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFooter-min-lengthUndefined`: Self = StObject.set(x, "footer-min-length", js.undefined)
      
      @scala.inline
      def `setHeader-case`(value: Rule[Case]): Self = StObject.set(x, "header-case", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHeader-caseUndefined`: Self = StObject.set(x, "header-case", js.undefined)
      
      @scala.inline
      def `setHeader-full-stop`(value: Rule[String]): Self = StObject.set(x, "header-full-stop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHeader-full-stopUndefined`: Self = StObject.set(x, "header-full-stop", js.undefined)
      
      @scala.inline
      def `setHeader-max-length`(value: Rule[Double]): Self = StObject.set(x, "header-max-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHeader-max-lengthUndefined`: Self = StObject.set(x, "header-max-length", js.undefined)
      
      @scala.inline
      def `setHeader-min-length`(value: Rule[Double]): Self = StObject.set(x, "header-min-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHeader-min-lengthUndefined`: Self = StObject.set(x, "header-min-length", js.undefined)
      
      @scala.inline
      def `setReferences-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "references-empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setReferences-emptyUndefined`: Self = StObject.set(x, "references-empty", js.undefined)
      
      @scala.inline
      def `setScope-case`(value: Rule[Case]): Self = StObject.set(x, "scope-case", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScope-caseUndefined`: Self = StObject.set(x, "scope-case", js.undefined)
      
      @scala.inline
      def `setScope-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "scope-empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScope-emptyUndefined`: Self = StObject.set(x, "scope-empty", js.undefined)
      
      @scala.inline
      def `setScope-enum`(value: Rule[js.Array[String]]): Self = StObject.set(x, "scope-enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScope-enumUndefined`: Self = StObject.set(x, "scope-enum", js.undefined)
      
      @scala.inline
      def `setScope-max-length`(value: Rule[Double]): Self = StObject.set(x, "scope-max-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScope-max-lengthUndefined`: Self = StObject.set(x, "scope-max-length", js.undefined)
      
      @scala.inline
      def `setScope-min-length`(value: Rule[Double]): Self = StObject.set(x, "scope-min-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScope-min-lengthUndefined`: Self = StObject.set(x, "scope-min-length", js.undefined)
      
      @scala.inline
      def `setSigned-off-by`(value: Rule[String]): Self = StObject.set(x, "signed-off-by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSigned-off-byUndefined`: Self = StObject.set(x, "signed-off-by", js.undefined)
      
      @scala.inline
      def `setSubject-case`(value: Rule[Case | js.Array[Case]]): Self = StObject.set(x, "subject-case", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSubject-caseUndefined`: Self = StObject.set(x, "subject-case", js.undefined)
      
      @scala.inline
      def `setSubject-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "subject-empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSubject-emptyUndefined`: Self = StObject.set(x, "subject-empty", js.undefined)
      
      @scala.inline
      def `setSubject-full-stop`(value: Rule[String]): Self = StObject.set(x, "subject-full-stop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSubject-full-stopUndefined`: Self = StObject.set(x, "subject-full-stop", js.undefined)
      
      @scala.inline
      def `setSubject-max-length`(value: Rule[Double]): Self = StObject.set(x, "subject-max-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSubject-max-lengthUndefined`: Self = StObject.set(x, "subject-max-length", js.undefined)
      
      @scala.inline
      def `setSubject-min-length`(value: Rule[Double]): Self = StObject.set(x, "subject-min-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSubject-min-lengthUndefined`: Self = StObject.set(x, "subject-min-length", js.undefined)
      
      @scala.inline
      def `setType-case`(value: Rule[Case]): Self = StObject.set(x, "type-case", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setType-caseUndefined`: Self = StObject.set(x, "type-case", js.undefined)
      
      @scala.inline
      def `setType-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "type-empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setType-emptyUndefined`: Self = StObject.set(x, "type-empty", js.undefined)
      
      @scala.inline
      def `setType-enum`(value: Rule[js.Array[String]]): Self = StObject.set(x, "type-enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setType-enumUndefined`: Self = StObject.set(x, "type-enum", js.undefined)
      
      @scala.inline
      def `setType-max-length`(value: Rule[Double]): Self = StObject.set(x, "type-max-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setType-max-lengthUndefined`: Self = StObject.set(x, "type-max-length", js.undefined)
      
      @scala.inline
      def `setType-min-length`(value: Rule[Double]): Self = StObject.set(x, "type-min-length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setType-min-lengthUndefined`: Self = StObject.set(x, "type-min-length", js.undefined)
    }
  }
}
