package typingsSlinky.prosemirrorTestBuilder

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.prosemirrorModel.mod.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("prosemirror-test-builder", JSImport.Namespace)
  @js.native
  val ^ : ProsemirrorTestBuilder = js.native
  
  type Args = js.Array[String | TaggedProsemirrorNode[js.Any] | TaggedFlatObject[js.Any]]
  
  type Builder = js.Function2[
    /* testSchema */ Schema[String, String], 
    /* names */ Record[String, NodeTypeAttributes | MarkTypeAttributes], 
    (Record[String, NodeBuilderMethod[Schema[String, String]]]) with (Record[String, MarkBuilderMethod[Schema[String, String]]]) with typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.Builder with (TopLevel[Record[String, NodeTypeAttributes | MarkTypeAttributes]])
  ]
  
  @js.native
  trait EqMethod extends StObject {
    
    def eq(param: EqMethod): Boolean = js.native
  }
  object EqMethod {
    
    @scala.inline
    def apply(eq_ : EqMethod => Boolean): EqMethod = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
      __obj.asInstanceOf[EqMethod]
    }
    
    @scala.inline
    implicit class EqMethodMutableBuilder[Self <: EqMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEq_(value: EqMethod => Boolean): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
    }
  }
  
  type MarkBuilderMethod[S /* <: Schema[_, _] */] = js.Function1[/* args */ Args, TaggedFlatObject[S]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ @js.native
  trait MarkTypeAttributes extends StObject {
    
    var markType: String = js.native
  }
  object MarkTypeAttributes {
    
    @scala.inline
    def apply(markType: String): MarkTypeAttributes = {
      val __obj = js.Dynamic.literal(markType = markType.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkTypeAttributes]
    }
    
    @scala.inline
    implicit class MarkTypeAttributesMutableBuilder[Self <: MarkTypeAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarkType(value: String): Self = StObject.set(x, "markType", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeBuilderMethod[S /* <: Schema[_, _] */] = js.Function1[/* args */ Args, TaggedProsemirrorNode[S]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ @js.native
  trait NodeTypeAttributes extends StObject {
    
    var nodeType: String = js.native
  }
  object NodeTypeAttributes {
    
    @scala.inline
    def apply(nodeType: String): NodeTypeAttributes = {
      val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeTypeAttributes]
    }
    
    @scala.inline
    implicit class NodeTypeAttributesMutableBuilder[Self <: NodeTypeAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProsemirrorTestBuilder extends StObject {
    
    def a(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema] = js.native
    @JSName("a")
    var a_Original: MarkBuilderMethod[TestSchema] = js.native
    
    def blockquote(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("blockquote")
    var blockquote_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def br(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("br")
    var br_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def builders[Obj /* <: Record[String, NodeTypeAttributes | MarkTypeAttributes] */, N /* <: String */, M /* <: String */](testSchema: Schema[N, M], names: Obj): (Record[N, NodeBuilderMethod[Schema[N, M]]]) with (Record[M, MarkBuilderMethod[Schema[N, M]]]) with typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ProsemirrorTestBuilder with TopLevel[Obj] = js.native
    @JSName("builders")
    var builders_Original: Builder = js.native
    
    def bullet_list(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("bullet_list")
    var bullet_list_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def code(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema] = js.native
    @JSName("code")
    var code_Original: MarkBuilderMethod[TestSchema] = js.native
    
    def code_block(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("code_block")
    var code_block_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def doc(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("doc")
    var doc_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def em(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema] = js.native
    @JSName("em")
    var em_Original: MarkBuilderMethod[TestSchema] = js.native
    
    def eq(a: EqMethod, b: EqMethod): Boolean = js.native
    
    def h1(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("h1")
    var h1_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def h2(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("h2")
    var h2_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def h3(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("h3")
    var h3_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def hard_break(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("hard_break")
    var hard_break_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def heading(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("heading")
    var heading_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def horizontal_rule(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("horizontal_rule")
    var horizontal_rule_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def hr(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("hr")
    var hr_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def image(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("image")
    var image_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def img(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("img")
    var img_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def li(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("li")
    var li_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def link(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema] = js.native
    @JSName("link")
    var link_Original: MarkBuilderMethod[TestSchema] = js.native
    
    def list_item(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("list_item")
    var list_item_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def ol(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("ol")
    var ol_Original: NodeBuilderMethod[TestSchema] = js.native
    
    // From schema list
    def ordered_list(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    // From schema list
    @JSName("ordered_list")
    var ordered_list_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def p(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("p")
    var p_Original: NodeBuilderMethod[TestSchema] = js.native
    
    // From schema basic
    def paragraph(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    // From schema basic
    @JSName("paragraph")
    var paragraph_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def pre(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("pre")
    var pre_Original: NodeBuilderMethod[TestSchema] = js.native
    
    var schema: TestSchema = js.native
    
    def strong(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema] = js.native
    @JSName("strong")
    var strong_Original: MarkBuilderMethod[TestSchema] = js.native
    
    def text(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("text")
    var text_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def ul(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("ul")
    var ul_Original: NodeBuilderMethod[TestSchema] = js.native
  }
  
  @js.native
  trait TaggedFlatObject[S /* <: Schema[_, _] */] extends StObject {
    
    var flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]] = js.native
    
    var tag: Record[String, Double] = js.native
  }
  object TaggedFlatObject {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]], tag: Record[String, Double]): TaggedFlatObject[S] = {
      val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaggedFlatObject[S]]
    }
    
    @scala.inline
    implicit class TaggedFlatObjectMutableBuilder[Self <: TaggedFlatObject[_], S /* <: Schema[_, _] */] (val x: Self with TaggedFlatObject[S]) extends AnyVal {
      
      @scala.inline
      def setFlat(value: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatVarargs(value: (TaggedProsemirrorNode[S] | TaggedFlatObject[S])*): Self = StObject.set(x, "flat", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: Record[String, Double]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TaggedProsemirrorNode[S /* <: Schema[_, _] */]
    extends Node[js.Any]
       with TaggedFlatObject[S]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.a
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.link
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.em
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.strong
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code
  */
  trait TestMarksUnion extends StObject
  object TestMarksUnion {
    
    @scala.inline
    def a: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.a = "a".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.a]
    
    @scala.inline
    def code: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code = "code".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code]
    
    @scala.inline
    def em: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.em = "em".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.em]
    
    @scala.inline
    def link: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.link = "link".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.link]
    
    @scala.inline
    def strong: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.strong = "strong".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.strong]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.p
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.pre
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h1
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h2
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h3
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.li
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ul
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ol
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.br
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.img
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hr
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ordered_list
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.bullet_list
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.list_item
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.doc
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.paragraph
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.blockquote
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.horizontal_rule
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.heading
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code_block
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.text
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.image
    - typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hard_break
  */
  trait TestNodesUnion extends StObject
  object TestNodesUnion {
    
    @scala.inline
    def blockquote: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.blockquote = "blockquote".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.blockquote]
    
    @scala.inline
    def br: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.br = "br".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.br]
    
    @scala.inline
    def bullet_list: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.bullet_list = "bullet_list".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.bullet_list]
    
    @scala.inline
    def code_block: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code_block = "code_block".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code_block]
    
    @scala.inline
    def doc: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.doc = "doc".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.doc]
    
    @scala.inline
    def h1: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h1 = "h1".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h1]
    
    @scala.inline
    def h2: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h2 = "h2".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h2]
    
    @scala.inline
    def h3: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h3 = "h3".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h3]
    
    @scala.inline
    def hard_break: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hard_break = "hard_break".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hard_break]
    
    @scala.inline
    def heading: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.heading = "heading".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.heading]
    
    @scala.inline
    def horizontal_rule: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.horizontal_rule = "horizontal_rule".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.horizontal_rule]
    
    @scala.inline
    def hr: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hr = "hr".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hr]
    
    @scala.inline
    def image: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.image = "image".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.image]
    
    @scala.inline
    def img: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.img = "img".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.img]
    
    @scala.inline
    def li: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.li = "li".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.li]
    
    @scala.inline
    def list_item: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.list_item = "list_item".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.list_item]
    
    @scala.inline
    def ol: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ol = "ol".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ol]
    
    @scala.inline
    def ordered_list: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ordered_list = "ordered_list".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ordered_list]
    
    @scala.inline
    def p: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.p = "p".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.p]
    
    @scala.inline
    def paragraph: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.paragraph = "paragraph".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.paragraph]
    
    @scala.inline
    def pre: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.pre = "pre".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.pre]
    
    @scala.inline
    def text: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.text = "text".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.text]
    
    @scala.inline
    def ul: typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ul = "ul".asInstanceOf[typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ul]
  }
  
  type TestSchema = Schema[TestNodesUnion, TestMarksUnion]
  
  type _To = ProsemirrorTestBuilder
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ProsemirrorTestBuilder = ^
}
