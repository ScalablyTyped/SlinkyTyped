package typingsSlinky.jscodeshift

import typingsSlinky.jscodeshift.collectionMod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("jscodeshift/src/collections/Node", "register")
  @js.native
  def register(): Unit = js.native
  
  type ASTPath[N] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.NodePath<N, N> */ js.Any
  
  @js.native
  trait MutationMethods[N] extends StObject {
    
    /**
      * Inserts a new node after the current one.
      */
    def insertAfter(insert: js.Any): Collection[N] = js.native
    
    /**
      * Inserts a new node before the current one.
      */
    def insertBefore(insert: js.Any): Collection[N] = js.native
    
    def remove(): Collection[N] = js.native
    
    /**
      * Simply replaces the selected nodes with the provided node. If a function
      * is provided it is executed for every node and the node is replaced with the
      * functions return value.
      */
    def replaceWith[T](nodes: T): Collection[T] = js.native
    def replaceWith[T](nodes: js.Array[T]): Collection[T] = js.native
    def replaceWith[T](nodes: js.Function2[/* path */ ASTPath[N], /* i */ Double, T]): Collection[T] = js.native
  }
  
  @js.native
  trait TraversalMethods extends StObject {
    
    /**
      * Traverse the AST up and finds the closest node of the provided type.
      */
    def closest[T](
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Type<T> */ js.Any
    ): Collection[T] = js.native
    def closest[T](
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Type<T> */ js.Any,
      filter: js.Any
    ): Collection[T] = js.native
    
    /**
      * Returns a collection containing the paths that create the scope of the
      * currently selected paths. Dedupes the paths.
      */
    def closestScope(): Collection[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nodes.ASTNode */ _
      ] = js.native
    
    /**
      * Find nodes of a specific type within the nodes of this collection.
      */
    def find[T](
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Type<T> */ js.Any
    ): Collection[T] = js.native
    def find[T](
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Type<T> */ js.Any,
      filter: js.Function1[/* value */ js.Any, Boolean]
    ): Collection[T] = js.native
    def find[T](
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Type<T> */ js.Any,
      filter: js.Object
    ): Collection[T] = js.native
    
    /**
      * Finds the declaration for each selected path. Useful for member expressions
      * or JSXElements. Expects a callback function that maps each path to the name
      * to look for.
      *
      * If the callback returns a falsy value, the element is skipped.
      */
    def getVariableDeclarators(nameGetter: js.Function1[/* repeated */ js.Any, _]): Collection[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nodes.VariableDeclarator */ _
      ] = js.native
  }
}
