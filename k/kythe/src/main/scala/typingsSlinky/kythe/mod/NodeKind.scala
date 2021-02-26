package typingsSlinky.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeKind extends StObject
@JSImport("kythe", "NodeKind")
@js.native
object NodeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NodeKind with String] = js.native
  
  @js.native
  sealed trait ABS extends NodeKind
  /* "abs" */ val ABS: typingsSlinky.kythe.mod.NodeKind.ABS with String = js.native
  
  @js.native
  sealed trait ABSVAR extends NodeKind
  /* "absvar" */ val ABSVAR: typingsSlinky.kythe.mod.NodeKind.ABSVAR with String = js.native
  
  @js.native
  sealed trait ANCHOR extends NodeKind
  /* "anchor" */ val ANCHOR: typingsSlinky.kythe.mod.NodeKind.ANCHOR with String = js.native
  
  @js.native
  sealed trait CONSTANT extends NodeKind
  /* "constant" */ val CONSTANT: typingsSlinky.kythe.mod.NodeKind.CONSTANT with String = js.native
  
  @js.native
  sealed trait DIAGNOSTIC extends NodeKind
  /* "diagnostic" */ val DIAGNOSTIC: typingsSlinky.kythe.mod.NodeKind.DIAGNOSTIC with String = js.native
  
  @js.native
  sealed trait DOC extends NodeKind
  /* "doc" */ val DOC: typingsSlinky.kythe.mod.NodeKind.DOC with String = js.native
  
  @js.native
  sealed trait FILE extends NodeKind
  /* "file" */ val FILE: typingsSlinky.kythe.mod.NodeKind.FILE with String = js.native
  
  @js.native
  sealed trait FUNCTION extends NodeKind
  /* "function" */ val FUNCTION: typingsSlinky.kythe.mod.NodeKind.FUNCTION with String = js.native
  
  @js.native
  sealed trait INTERFACE extends NodeKind
  /* "interface" */ val INTERFACE: typingsSlinky.kythe.mod.NodeKind.INTERFACE with String = js.native
  
  @js.native
  sealed trait LOOKUP extends NodeKind
  /* "lookup" */ val LOOKUP: typingsSlinky.kythe.mod.NodeKind.LOOKUP with String = js.native
  
  @js.native
  sealed trait MACRO extends NodeKind
  /* "macro" */ val MACRO: typingsSlinky.kythe.mod.NodeKind.MACRO with String = js.native
  
  @js.native
  sealed trait META extends NodeKind
  /* "meta" */ val META: typingsSlinky.kythe.mod.NodeKind.META with String = js.native
  
  @js.native
  sealed trait NAME extends NodeKind
  /* "name" */ val NAME: typingsSlinky.kythe.mod.NodeKind.NAME with String = js.native
  
  @js.native
  sealed trait PACKAGE extends NodeKind
  /* "package" */ val PACKAGE: typingsSlinky.kythe.mod.NodeKind.PACKAGE with String = js.native
  
  @js.native
  sealed trait PROCESS extends NodeKind
  /* "process" */ val PROCESS: typingsSlinky.kythe.mod.NodeKind.PROCESS with String = js.native
  
  @js.native
  sealed trait RECORD extends NodeKind
  /* "record" */ val RECORD: typingsSlinky.kythe.mod.NodeKind.RECORD with String = js.native
  
  @js.native
  sealed trait SUM extends NodeKind
  /* "sum" */ val SUM: typingsSlinky.kythe.mod.NodeKind.SUM with String = js.native
  
  @js.native
  sealed trait SYMBOL extends NodeKind
  /* "symbol" */ val SYMBOL: typingsSlinky.kythe.mod.NodeKind.SYMBOL with String = js.native
  
  @js.native
  sealed trait TALIAS extends NodeKind
  /* "talias" */ val TALIAS: typingsSlinky.kythe.mod.NodeKind.TALIAS with String = js.native
  
  @js.native
  sealed trait TAPP extends NodeKind
  /* "tapp" */ val TAPP: typingsSlinky.kythe.mod.NodeKind.TAPP with String = js.native
  
  @js.native
  sealed trait TBUILTIN extends NodeKind
  /* "tbuiltin" */ val TBUILTIN: typingsSlinky.kythe.mod.NodeKind.TBUILTIN with String = js.native
  
  @js.native
  sealed trait TNOMINAL extends NodeKind
  /* "tnominal" */ val TNOMINAL: typingsSlinky.kythe.mod.NodeKind.TNOMINAL with String = js.native
  
  @js.native
  sealed trait TSIGMA extends NodeKind
  /* "tsigma" */ val TSIGMA: typingsSlinky.kythe.mod.NodeKind.TSIGMA with String = js.native
  
  @js.native
  sealed trait VARIABLE extends NodeKind
  /* "variable" */ val VARIABLE: typingsSlinky.kythe.mod.NodeKind.VARIABLE with String = js.native
  
  @js.native
  sealed trait VCS extends NodeKind
  /* "vcs" */ val VCS: typingsSlinky.kythe.mod.NodeKind.VCS with String = js.native
}
