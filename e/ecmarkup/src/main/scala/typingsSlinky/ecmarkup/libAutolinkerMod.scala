package typingsSlinky.ecmarkup

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsSlinky.ecmarkup.libAutolinkerMod.AutoLinkMap
import typingsSlinky.ecmarkup.libBiblioMod.BiblioEntry
import typingsSlinky.ecmarkup.libSpecMod.Spec
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/autolinker", JSImport.Namespace)
@js.native
object libAutolinkerMod extends js.Object {
  val NO_CLAUSE_AUTOLINK: Set[String] = js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: String,
    allowSameId: Boolean
  ): Unit = js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: String,
    allowSameId: Boolean
  ): Unit = js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = js.native
  def replacerForNamespace(
    namespace: String,
    biblio: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Biblio */ js.Any
  ): js.Tuple2[js.RegExp, AutoLinkMap] = js.native
  type AutoLinkMap = StringDictionary[BiblioEntry]
}

