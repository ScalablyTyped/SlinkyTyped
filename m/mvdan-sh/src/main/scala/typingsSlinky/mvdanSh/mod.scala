package typingsSlinky.mvdanSh

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.mvdanSh.anon.BinaryNextLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mvdan-sh", JSImport.Default)
  @js.native
  val default: ShellScript = js.native
  
  @js.native
  sealed trait LangVariant extends StObject
  @JSImport("mvdan-sh", "LangVariant")
  @js.native
  object LangVariant extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LangVariant with Double] = js.native
    
    @js.native
    sealed trait LangBash extends LangVariant
    /* 0 */ val LangBash: typingsSlinky.mvdanSh.mod.LangVariant.LangBash with Double = js.native
    
    @js.native
    sealed trait LangMirBSDKorn extends LangVariant
    /* 2 */ val LangMirBSDKorn: typingsSlinky.mvdanSh.mod.LangVariant.LangMirBSDKorn with Double = js.native
    
    @js.native
    sealed trait LangPOSIX extends LangVariant
    /* 1 */ val LangPOSIX: typingsSlinky.mvdanSh.mod.LangVariant.LangPOSIX with Double = js.native
  }
  
  @js.native
  trait Command extends Node {
    
    var OpPos: Pos = js.native
  }
  object Command {
    
    @scala.inline
    def apply(End: () => Pos, OpPos: Pos, Pos: () => Pos): Command = {
      val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), OpPos = OpPos.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos))
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpPos(value: Pos): Self = StObject.set(x, "OpPos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Comment extends Node {
    
    var Hash: Pos = js.native
    
    var Text: String = js.native
  }
  object Comment {
    
    @scala.inline
    def apply(End: () => Pos, Hash: Pos, Pos: () => Pos, Text: String): Comment = {
      val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Hash = Hash.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos), Text = Text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: Pos): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait File extends Node {
    
    var Last: js.Array[Stmt] = js.native
    
    var Name: String = js.native
    
    var Stmts: js.UndefOr[js.Array[Stmt]] = js.native
  }
  object File {
    
    @scala.inline
    def apply(End: () => Pos, Last: js.Array[Stmt], Name: String, Pos: () => Pos): File = {
      val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Last = Last.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos))
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLast(value: js.Array[Stmt]): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastVarargs(value: Stmt*): Self = StObject.set(x, "Last", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStmts(value: js.Array[Stmt]): Self = StObject.set(x, "Stmts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStmtsUndefined: Self = StObject.set(x, "Stmts", js.undefined)
      
      @scala.inline
      def setStmtsVarargs(value: Stmt*): Self = StObject.set(x, "Stmts", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Lit extends Node {
    
    var Value: String = js.native
    
    var ValueEnd: Pos = js.native
    
    var ValuePos: Pos = js.native
  }
  object Lit {
    
    @scala.inline
    def apply(End: () => Pos, Pos: () => Pos, Value: String, ValueEnd: Pos, ValuePos: Pos): Lit = {
      val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Pos = js.Any.fromFunction0(Pos), Value = Value.asInstanceOf[js.Any], ValueEnd = ValueEnd.asInstanceOf[js.Any], ValuePos = ValuePos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lit]
    }
    
    @scala.inline
    implicit class LitMutableBuilder[Self <: Lit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueEnd(value: Pos): Self = StObject.set(x, "ValueEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePos(value: Pos): Self = StObject.set(x, "ValuePos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Node extends StObject {
    
    def End(): Pos = js.native
    
    def Pos(): typingsSlinky.mvdanSh.mod.Pos = js.native
  }
  object Node {
    
    @scala.inline
    def apply(End: () => Pos, Pos: () => Pos): Node = {
      val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Pos = js.Any.fromFunction0(Pos))
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: () => Pos): Self = StObject.set(x, "End", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPos(value: () => Pos): Self = StObject.set(x, "Pos", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Parser extends StObject {
    
    def Parse(text: String): File = js.native
    def Parse(text: String, path: String): File = js.native
  }
  
  type ParserOption = js.Function1[/* parser */ Parser, Unit]
  
  @js.native
  trait Pos extends StObject {
    
    def After(p: Pos): Boolean = js.native
    
    def Col(): Double = js.native
    
    def IsValid(): Boolean = js.native
    
    def Line(): Double = js.native
    
    def Offset(): Double = js.native
    
    def String(): java.lang.String = js.native
  }
  object Pos {
    
    @scala.inline
    def apply(
      After: Pos => Boolean,
      Col: () => Double,
      IsValid: () => Boolean,
      Line: () => Double,
      Offset: () => Double,
      String: () => String
    ): Pos = {
      val __obj = js.Dynamic.literal(After = js.Any.fromFunction1(After), Col = js.Any.fromFunction0(Col), IsValid = js.Any.fromFunction0(IsValid), Line = js.Any.fromFunction0(Line), Offset = js.Any.fromFunction0(Offset), String = js.Any.fromFunction0(String))
      __obj.asInstanceOf[Pos]
    }
    
    @scala.inline
    implicit class PosMutableBuilder[Self <: Pos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: Pos => Boolean): Self = StObject.set(x, "After", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCol(value: () => Double): Self = StObject.set(x, "Col", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsValid(value: () => Boolean): Self = StObject.set(x, "IsValid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLine(value: () => Double): Self = StObject.set(x, "Line", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOffset(value: () => Double): Self = StObject.set(x, "Offset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setString(value: () => String): Self = StObject.set(x, "String", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Printer extends StObject {
    
    def Print(node: Node): String = js.native
  }
  object Printer {
    
    @scala.inline
    def apply(Print: Node => String): Printer = {
      val __obj = js.Dynamic.literal(Print = js.Any.fromFunction1(Print))
      __obj.asInstanceOf[Printer]
    }
    
    @scala.inline
    implicit class PrinterMutableBuilder[Self <: Printer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrint(value: Node => String): Self = StObject.set(x, "Print", js.Any.fromFunction1(value))
    }
  }
  
  type PrinterOption = js.Function1[/* printer */ Printer, Unit]
  
  @js.native
  trait ShellScript extends StObject {
    
    var syntax: BinaryNextLine = js.native
  }
  object ShellScript {
    
    @scala.inline
    def apply(syntax: BinaryNextLine): ShellScript = {
      val __obj = js.Dynamic.literal(syntax = syntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShellScript]
    }
    
    @scala.inline
    implicit class ShellScriptMutableBuilder[Self <: ShellScript] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSyntax(value: BinaryNextLine): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stmt extends Node {
    
    var Background: Boolean = js.native
    
    var Cmd: Command = js.native
    
    var Comments: js.Array[Comment] = js.native
    
    var Coprocess: Boolean = js.native
    
    var Negated: Boolean = js.native
    
    var Position: Pos = js.native
    
    var Semicolon: Pos = js.native
  }
  object Stmt {
    
    @scala.inline
    def apply(
      Background: Boolean,
      Cmd: Command,
      Comments: js.Array[Comment],
      Coprocess: Boolean,
      End: () => Pos,
      Negated: Boolean,
      Pos: () => Pos,
      Position: Pos,
      Semicolon: Pos
    ): Stmt = {
      val __obj = js.Dynamic.literal(Background = Background.asInstanceOf[js.Any], Cmd = Cmd.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], Coprocess = Coprocess.asInstanceOf[js.Any], End = js.Any.fromFunction0(End), Negated = Negated.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos), Position = Position.asInstanceOf[js.Any], Semicolon = Semicolon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stmt]
    }
    
    @scala.inline
    implicit class StmtMutableBuilder[Self <: Stmt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: Boolean): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmd(value: Command): Self = StObject.set(x, "Cmd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComments(value: js.Array[Comment]): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "Comments", js.Array(value :_*))
      
      @scala.inline
      def setCoprocess(value: Boolean): Self = StObject.set(x, "Coprocess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegated(value: Boolean): Self = StObject.set(x, "Negated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Pos): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemicolon(value: Pos): Self = StObject.set(x, "Semicolon", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Word extends Node {
    
    def Lit(): String = js.native
    
    var Parts: js.Array[WordPart] = js.native
  }
  object Word {
    
    @scala.inline
    def apply(End: () => Pos, Lit: () => String, Parts: js.Array[WordPart], Pos: () => Pos): Word = {
      val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Lit = js.Any.fromFunction0(Lit), Parts = Parts.asInstanceOf[js.Any], Pos = js.Any.fromFunction0(Pos))
      __obj.asInstanceOf[Word]
    }
    
    @scala.inline
    implicit class WordMutableBuilder[Self <: Word] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLit(value: () => String): Self = StObject.set(x, "Lit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParts(value: js.Array[WordPart]): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsVarargs(value: WordPart*): Self = StObject.set(x, "Parts", js.Array(value :_*))
    }
  }
  
  type WordPart = Node
  
  type _To = ShellScript
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ShellScript = default
}
