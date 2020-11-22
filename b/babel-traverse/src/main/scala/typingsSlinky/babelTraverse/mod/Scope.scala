package typingsSlinky.babelTraverse.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babelTypes.ts36Mod.Identifier_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-traverse", "Scope")
@js.native
class Scope protected () extends js.Object {
  def this(path: NodePath[Node]) = this()
  def this(path: NodePath[Node], parentScope: Scope) = this()
  
  def addGlobal(node: Node): Unit = js.native
  
  def bindingIdentifierEquals(name: String, node: Node): Boolean = js.native
  
  var bindings: StringDictionary[Binding] = js.native
  
  var block: Node = js.native
  
  def buildUndefinedNode(): Node = js.native
  
  def checkBlockScopedCollisions(local: Node, kind: String, name: String, id: js.Object): Unit = js.native
  
  def dump(): Unit = js.native
  
  /** Generate a unique identifier and add it to the current scope. */
  def generateDeclaredUidIdentifier(): Identifier_ = js.native
  def generateDeclaredUidIdentifier(name: String): Identifier_ = js.native
  
  /** Generate a unique `_id1` binding. */
  def generateUid(): String = js.native
  def generateUid(name: String): String = js.native
  
  /** Generate a unique identifier. */
  def generateUidIdentifier(): Identifier_ = js.native
  def generateUidIdentifier(name: String): Identifier_ = js.native
  
  /** Generate a unique identifier based on a node. */
  def generateUidIdentifierBasedOnNode(parent: Node): Identifier_ = js.native
  def generateUidIdentifierBasedOnNode(parent: Node, defaultName: String): Identifier_ = js.native
  
  /** Walks the scope tree and gathers **all** bindings. */
  def getAllBindings(kinds: String*): js.Object = js.native
  
  def getBinding(name: String): js.UndefOr[Binding] = js.native
  
  def getBindingIdentifier(name: String): Identifier_ = js.native
  
  def getBlockParent(): Scope = js.native
  
  def getData(key: String): js.Any = js.native
  
  def getFunctionParent(): Scope = js.native
  
  def getOwnBinding(name: String): js.UndefOr[Binding] = js.native
  
  def getOwnBindingIdentifier(name: String): Identifier_ = js.native
  
  def getProgramParent(): Scope = js.native
  
  def hasBinding(name: String): Boolean = js.native
  def hasBinding(name: String, noGlobals: Boolean): Boolean = js.native
  
  def hasGlobal(name: String): Boolean = js.native
  
  def hasOwnBinding(name: String): Boolean = js.native
  
  def hasReference(name: String): Boolean = js.native
  
  def hasUid(name: String): Boolean = js.native
  
  var hub: Hub = js.native
  
  def isPure(node: Node): Boolean = js.native
  def isPure(node: Node, constantsOnly: Boolean): Boolean = js.native
  
  /**
    * Determine whether evaluating the specific input `node` is a consequenceless reference. ie.
    * evaluating it wont result in potentially arbitrary code from being ran. The following are
    * whitelisted and determined not to cause side effects:
    *
    *  - `this` expressions
    *  - `super` expressions
    *  - Bound identifiers
    */
  def isStatic(node: Node): Boolean = js.native
  
  /** Possibly generate a memoised identifier if it is not static and has consequences. */
  def maybeGenerateMemoised(node: Node): Identifier_ = js.native
  def maybeGenerateMemoised(node: Node, dontPush: Boolean): Identifier_ = js.native
  
  /** Move a binding of `name` to another `scope`. */
  def moveBindingTo(name: String, scope: Scope): Unit = js.native
  
  var parent: Scope = js.native
  
  var parentBlock: Node = js.native
  
  def parentHasBinding(name: String): Boolean = js.native
  def parentHasBinding(name: String, noGlobals: Boolean): Boolean = js.native
  
  var path: NodePath[Node] = js.native
  
  def push(opts: js.Any): Unit = js.native
  
  def registerBinding(kind: String, path: NodePath[Node]): Unit = js.native
  def registerBinding(kind: String, path: NodePath[Node], bindingPath: NodePath[Node]): Unit = js.native
  
  def registerConstantViolation(path: NodePath[Node]): Unit = js.native
  
  def registerDeclaration(path: NodePath[Node]): Unit = js.native
  
  def removeBinding(name: String): Unit = js.native
  
  def removeData(key: String): Unit = js.native
  
  def removeOwnBinding(name: String): Unit = js.native
  
  def rename(oldName: String): Unit = js.native
  def rename(oldName: String, newName: js.UndefOr[scala.Nothing], block: Node): Unit = js.native
  def rename(oldName: String, newName: String): Unit = js.native
  def rename(oldName: String, newName: String, block: Node): Unit = js.native
  
  def setData(key: String, `val`: js.Any): js.Any = js.native
  
  def toArray(node: Node): Node = js.native
  def toArray(node: Node, i: Double): Node = js.native
  
  def traverse(node: js.Array[Node]): Unit = js.native
  def traverse(node: js.Array[Node], opts: js.UndefOr[scala.Nothing], state: js.Any): Unit = js.native
  def traverse(node: js.Array[Node], opts: TraverseOptions[Node]): Unit = js.native
  def traverse(node: js.Array[Node], opts: TraverseOptions[Node], state: js.Any): Unit = js.native
  def traverse(node: Node): Unit = js.native
  def traverse(node: Node, opts: js.UndefOr[scala.Nothing], state: js.Any): Unit = js.native
  def traverse(node: Node, opts: TraverseOptions[Node]): Unit = js.native
  def traverse(node: Node, opts: TraverseOptions[Node], state: js.Any): Unit = js.native
  def traverse[S](node: js.Array[Node], opts: TraverseOptions[S], state: S): Unit = js.native
  /** Traverse node with current scope and path. */
  def traverse[S](node: Node, opts: TraverseOptions[S], state: S): Unit = js.native
}
