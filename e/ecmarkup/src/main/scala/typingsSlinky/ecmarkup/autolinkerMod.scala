package typingsSlinky.ecmarkup

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsSlinky.ecmarkup.biblioMod.BiblioEntry
import typingsSlinky.ecmarkup.specMod.Spec
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autolinkerMod {
  
  @JSImport("ecmarkup/lib/autolinker", "NO_CLAUSE_AUTOLINK")
  @js.native
  val NO_CLAUSE_AUTOLINK: Set[String] = js.native
  
  @JSImport("ecmarkup/lib/autolinker", "autolink")
  @js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: String,
    allowSameId: Boolean
  ): Unit = js.native
  @JSImport("ecmarkup/lib/autolinker", "autolink")
  @js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = js.native
  @JSImport("ecmarkup/lib/autolinker", "autolink")
  @js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: String,
    allowSameId: Boolean
  ): Unit = js.native
  @JSImport("ecmarkup/lib/autolinker", "autolink")
  @js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = js.native
  
  @JSImport("ecmarkup/lib/autolinker", "replacerForNamespace")
  @js.native
  def replacerForNamespace(
    namespace: String,
    biblio: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Biblio */ js.Any
  ): js.Tuple2[js.RegExp, AutoLinkMap] = js.native
  
  type AutoLinkMap = StringDictionary[BiblioEntry]
}
