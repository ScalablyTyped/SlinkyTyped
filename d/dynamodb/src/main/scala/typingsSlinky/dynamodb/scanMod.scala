package typingsSlinky.dynamodb

import typingsSlinky.dynamodb.anon.AttributeNames
import typingsSlinky.dynamodb.callbackMod.Callback
import typingsSlinky.dynamodb.executeFilterMod.ExecuteFilter
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynamodb/Scan", JSImport.Namespace)
@js.native
object scanMod extends js.Object {
  
  @js.native
  trait Scan extends js.Object {
    
    def addFilterCondition(condition: AttributeNames): Scan = js.native
    
    def attributes(attrs: String): Scan = js.native
    def attributes(attrs: js.Array[String]): Scan = js.native
    
    def beginsWith(name: String): Scan = js.native
    
    def between(start: String, end: String): Scan = js.native
    
    def buildRequest(): js.Any = js.native
    
    def contains(name: String): Scan = js.native
    
    def eq(args: js.Any*): Scan = js.native
    
    def equals(args: js.Any*): Scan = js.native
    
    def exec(): Readable = js.native
    def exec(callback: Callback): Unit = js.native
    @JSName("exec")
    var exec_Original: ExecuteFilter = js.native
    
    def expressionAttributeNames(data: js.Any): Scan = js.native
    
    def expressionAttributeValues(data: js.Any): Scan = js.native
    
    def filterExpression(expression: js.Any): Scan = js.native
    
    def gt(args: js.Any*): Scan = js.native
    
    def gte(args: js.Any*): Scan = js.native
    
    def in(args: js.Any*): Scan = js.native
    
    def limit(num: Double): Scan = js.native
    
    def loadAll(): Scan = js.native
    
    def lt(args: js.Any*): Scan = js.native
    
    def lte(args: js.Any*): Scan = js.native
    
    def ne(args: js.Any*): Scan = js.native
    
    def notContains(name: String): Scan = js.native
    
    def notNull(): Scan = js.native
    
    def `null`(): Scan = js.native
    
    def projectionExpression(data: js.Any): Scan = js.native
    
    def returnConsumedCapacity(): Scan = js.native
    def returnConsumedCapacity(value: String): Scan = js.native
    
    def segments(segment: js.Any, totalSegments: js.Any): Scan = js.native
    
    def select(value: String): Scan = js.native
    
    def startKey(hashKey: String): Scan = js.native
    def startKey(hashKey: String, rangeKey: String): Scan = js.native
    
    def where(keyName: String): Scan = js.native
  }
  
  type ParallelScan = Scan
}
