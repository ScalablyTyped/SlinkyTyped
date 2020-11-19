package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.mappingMod.mapping.MappingOptions
import typingsSlinky.cassandraDriver.mappingMod.mapping.q.QueryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "mapping")
@js.native
object mapping extends js.Object {
  
  @js.native
  class DefaultTableMappings ()
    extends typingsSlinky.cassandraDriver.mappingMod.mapping.DefaultTableMappings
  
  @js.native
  class Mapper protected ()
    extends typingsSlinky.cassandraDriver.mappingMod.mapping.Mapper {
    def this(client: Client) = this()
    def this(client: Client, options: MappingOptions) = this()
  }
  
  @js.native
  class UnderscoreCqlToCamelCaseMappings ()
    extends typingsSlinky.cassandraDriver.mappingMod.mapping.UnderscoreCqlToCamelCaseMappings
  
  @js.native
  object q extends js.Object {
    
    def and(condition1: js.Any, condition2: js.Any): QueryOperator = js.native
    
    def append(value: js.Any): QueryOperator = js.native
    
    def decr(value: js.Any): QueryOperator = js.native
    
    def gt(value: js.Any): QueryOperator = js.native
    
    def gte(value: js.Any): QueryOperator = js.native
    
    @JSName("in_")
    def in(arr: js.Any): QueryOperator = js.native
    
    def incr(value: js.Any): QueryOperator = js.native
    
    def lt(value: js.Any): QueryOperator = js.native
    
    def lte(value: js.Any): QueryOperator = js.native
    
    def notEq(value: js.Any): QueryOperator = js.native
    
    def prepend(value: js.Any): QueryOperator = js.native
    
    def remove(value: js.Any): QueryOperator = js.native
  }
}
