package typingsSlinky.refStructDi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.refNapi.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The struct type meta-constructor. */
object mod {
  
  @JSImport("ref-struct-di", JSImport.Namespace)
  @js.native
  def apply(): StructType = js.native
  @JSImport("ref-struct-di", JSImport.Namespace)
  @js.native
  def apply(fields: js.UndefOr[scala.Nothing], opt: js.Object): StructType = js.native
  @JSImport("ref-struct-di", JSImport.Namespace)
  @js.native
  def apply(fields: js.Array[_]): StructType = js.native
  @JSImport("ref-struct-di", JSImport.Namespace)
  @js.native
  def apply(fields: js.Object): StructType = js.native
  @JSImport("ref-struct-di", JSImport.Namespace)
  @js.native
  def apply(fields: js.Object, opt: js.Object): StructType = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ref-struct-di", JSImport.Namespace)
  @js.native
  class Class () extends StructType {
    def this(fields: js.Array[_]) = this()
    def this(fields: js.Object) = this()
    def this(fields: js.UndefOr[scala.Nothing], opt: js.Object) = this()
    def this(fields: js.Object, opt: js.Object) = this()
  }
  
  /**
    * This is the `constructor` of the Struct type that gets returned.
    *
    * Invoke it with `new` to create a new Buffer instance backing the struct.
    * Pass it an existing Buffer instance to use that as the backing buffer.
    * Pass in an Object containing the struct fields to auto-populate the
    * struct with the data.
    *
    * @constructor
    */
  @js.native
  trait StructType
    extends Type
       with /** Pass it an existing Buffer instance to use that as the backing buffer. */
  Instantiable1[(/* arg */ Buffer) | (/* data */ js.Object), js.Any]
       with Instantiable0[js.Any]
       with Instantiable2[/* arg */ Buffer, /* data */ js.Object, js.Any] {
    
    def apply(): js.Any = js.native
    /** Pass it an existing Buffer instance to use that as the backing buffer. */
    def apply(arg: Buffer): js.Any = js.native
    def apply(arg: Buffer, data: js.Object): js.Any = js.native
    def apply(data: js.Object): js.Any = js.native
    
    /**
      * Adds a new field to the struct instance with the given name and type.
      * Note that this function will throw an Error if any instances of the struct
      * type have already been created, therefore this function must be called at the
      * beginning, before any instances are created.
      */
    def defineProperty(name: String, `type`: String): Unit = js.native
    /**
      * Adds a new field to the struct instance with the given name and type.
      * Note that this function will throw an Error if any instances of the struct
      * type have already been created, therefore this function must be called at the
      * beginning, before any instances are created.
      */
    def defineProperty(name: String, `type`: Type): Unit = js.native
    
    var fields: StringDictionary[typingsSlinky.refStructDi.anon.Type] = js.native
  }
}
