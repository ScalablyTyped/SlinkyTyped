package typingsSlinky.pulumiCloud

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("@pulumi/cloud/table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Table extends StObject {
    
    /**
      * Deletes a documents from the table.
      *
      * @param query An object with the primary key ("id" by default) assigned
      * the value to lookup.
      * @returns A promise for the success or failure of the delete.
      */
    def delete(query: js.Object): js.Promise[Unit] = js.native
    
    /**
      * Get a document from the table.
      *
      * @param query An object with the primary key ("id" by default) assigned
      * the value to lookup.
      * @returns A promise for the resulting document if found, or for undefined if not found,
      *   or a failed promise if the query could not be processed.
      */
    def get(query: js.Object): js.Promise[_] = js.native
    
    /**
      * Insert a document into the table.
      *
      * @param item An object representing the full document to insert. Must
      *   include a property for the primary key ("id" by default).
      * @returns A promise for the success or failure of the insert.
      */
    def insert(item: js.Object): js.Promise[Unit] = js.native
    
    /**
      * The name of the primary key.
      */
    val primaryKey: Output_[String] = js.native
    
    /**
      * The type of the primary key.
      */
    val primaryKeyType: Output_[String] = js.native
    
    /**
      * Gets all documents from the table.
      *
      * @param callback An optional callback that will be called for each page of results. If this callback returns
      * false, no more pages will be fetched.
      * @returns A promise for the resulting documents, or a failed promise if
      * the lookup fails.
      */
    def scan(): js.Promise[js.Array[_]] = js.native
    def scan(callback: js.Function1[/* items */ js.Array[_], js.Promise[Boolean]]): js.Promise[Unit] = js.native
    
    /**
      * Updates a documents in the table.
      *
      * @param query An object with the primary key ("id" by default) assigned
      * the value to lookup.
      * @param updates An object with all document properties that should be
      * updated.
      * @returns A promise for the success or failure of the update.
      */
    def update(query: js.Object, updates: js.Object): js.Promise[Unit] = js.native
  }
  @JSImport("@pulumi/cloud/table", "Table")
  @js.native
  def Table: TableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud/table", "Table")
  @js.native
  class TableCls protected () extends Table {
    /**
      * Creates a new Table.
      *
      * @param name A unique name for the table.
      * @param primaryKey An optional primary key name.
      * @param primaryKeyType An optional primary key type.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String) = this()
    def this(name: String, primaryKey: Input[String]) = this()
    def this(name: String, primaryKey: js.UndefOr[Input[String]], primaryKeyType: Input[PrimaryKeyType]) = this()
    def this(
      name: String,
      primaryKey: js.UndefOr[Input[String]],
      primaryKeyType: js.UndefOr[Input[PrimaryKeyType]],
      opts: ResourceOptions
    ) = this()
  }
  
  @scala.inline
  def Table_=(x: TableConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Table")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pulumiCloud.pulumiCloudStrings.string
    - typingsSlinky.pulumiCloud.pulumiCloudStrings.number
    - typingsSlinky.pulumiCloud.pulumiCloudStrings.boolean
  */
  trait PrimaryKeyType extends StObject
  object PrimaryKeyType {
    
    @scala.inline
    def boolean: typingsSlinky.pulumiCloud.pulumiCloudStrings.boolean = "boolean".asInstanceOf[typingsSlinky.pulumiCloud.pulumiCloudStrings.boolean]
    
    @scala.inline
    def number: typingsSlinky.pulumiCloud.pulumiCloudStrings.number = "number".asInstanceOf[typingsSlinky.pulumiCloud.pulumiCloudStrings.number]
    
    @scala.inline
    def string: typingsSlinky.pulumiCloud.pulumiCloudStrings.string = "string".asInstanceOf[typingsSlinky.pulumiCloud.pulumiCloudStrings.string]
  }
  
  @js.native
  trait TableConstructor
    extends /**
    * Creates a new Table.
    *
    * @param name A unique name for the table.
    * @param primaryKey An optional primary key name.
    * @param primaryKeyType An optional primary key type.
    * @param opts A bag of options that controls how this resource behaves.
    */
  Instantiable1[/* name */ String, Table]
       with Instantiable2[/* name */ String, /* primaryKey */ Input[String], Table]
       with Instantiable3[
          /* name */ String, 
          js.UndefOr[/* primaryKey */ Input[String]], 
          /* primaryKeyType */ Input[PrimaryKeyType], 
          Table
        ]
       with Instantiable4[
          /* name */ String, 
          js.UndefOr[/* primaryKey */ Input[String]], 
          js.UndefOr[/* primaryKeyType */ Input[PrimaryKeyType]], 
          /* opts */ ResourceOptions, 
          Table
        ]
}
