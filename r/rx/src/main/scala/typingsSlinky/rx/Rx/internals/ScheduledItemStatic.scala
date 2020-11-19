package typingsSlinky.rx.Rx.internals

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typingsSlinky.rx.Rx.Comparer
import typingsSlinky.rx.Rx.IDisposable
import typingsSlinky.rx.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledItemStatic
  extends Instantiable4[
      /* scheduler */ IScheduler, 
      /* state */ js.Any, 
      /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
      /* dueTime */ js.Object, 
      ScheduledItem[js.Object]
    ]
     with Instantiable5[
      /* scheduler */ IScheduler, 
      /* state */ js.Any, 
      /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
      /* dueTime */ js.Object, 
      /* comparer */ Comparer[js.Object, Double], 
      ScheduledItem[js.Object]
    ]
