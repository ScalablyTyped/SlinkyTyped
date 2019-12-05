package typingsSlinky.pullDashStream

import typingsSlinky.pullDashStream.pullDashStreamMod.Source
import typingsSlinky.pullDashStream.pullDashStreamMod.Through
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs", JSImport.Namespace)
@js.native
object throughsMod extends js.Object {
  @js.native
  object asyncMap extends js.Object {
    def apply[In, Out](
      fn: js.Function2[
          /* data */ In, 
          /* cb */ js.Function2[/* err */ js.Error | Null, /* result */ Out, Unit], 
          _
        ]
    ): Through[In, Out] = js.native
  }
  
  @js.native
  object filter extends js.Object {
    def apply[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through[InOut, InOut] = js.native
  }
  
  @js.native
  object filterNot extends js.Object {
    def apply[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through[InOut, InOut] = js.native
  }
  
  @js.native
  object flatten extends js.Object {
    def apply[Out](): Through[js.Array[Out | Source[Out] | (Through[_, Out])], Out] = js.native
  }
  
  @js.native
  object map extends js.Object {
    def apply[In, Out](fn: js.Function1[/* data */ In, Out]): Through[In, Out] = js.native
  }
  
  @js.native
  object nonUnique extends js.Object {
    def apply[InOut](): Through[InOut, InOut] = js.native
    def apply[InOut](prop: String): Through[InOut, InOut] = js.native
    def apply[InOut](prop: js.Function1[/* data */ InOut, _]): Through[InOut, InOut] = js.native
  }
  
  @js.native
  object take extends js.Object {
    def apply[InOut](n: Double): Through[InOut, InOut] = js.native
    def apply[InOut](testFn: js.Function1[/* data */ InOut, Boolean]): Through[InOut, InOut] = js.native
    def apply[InOut](testFn: js.Function1[/* data */ InOut, Boolean], opts: Anon_Last): Through[InOut, InOut] = js.native
  }
  
  @js.native
  object through extends js.Object {
    def apply[InOut](): Through[InOut, InOut] = js.native
    def apply[InOut](op: js.Function1[/* data */ InOut, _]): Through[InOut, InOut] = js.native
    def apply[InOut](op: js.Function1[/* data */ InOut, _], onEnd: js.Function1[/* err */ js.Error | Null, _]): Through[InOut, InOut] = js.native
  }
  
  @js.native
  object unique extends js.Object {
    def apply[InOut](): Through[InOut, InOut] = js.native
    def apply[InOut](prop: String): Through[InOut, InOut] = js.native
    def apply[InOut](prop: js.Function1[/* data */ InOut, _]): Through[InOut, InOut] = js.native
  }
  
}

