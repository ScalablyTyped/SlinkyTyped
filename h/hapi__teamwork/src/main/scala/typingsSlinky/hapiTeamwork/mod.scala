package typingsSlinky.hapiTeamwork

import typingsSlinky.hapiTeamwork.mod.Events.Iterator
import typingsSlinky.hapiTeamwork.mod.Team.ElementOf
import typingsSlinky.hapiTeamwork.mod.Team.Options
import typingsSlinky.std.AsyncIterator
import typingsSlinky.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/teamwork", "Events")
  @js.native
  class Events[T] () extends StObject {
    
    /**
      * Emits an event to be consumed via the iterator.
      *
      * @param value
      */
    def emit(value: T): Unit = js.native
    
    /**
      * Informs the iterator that no new events will be emitted.
      */
    def end(): Unit = js.native
    
    /**
      * Returns a standard async iterator interface object.
      *
      * @returns async iterator interface object.
      */
    def iterator(): Iterator[T] = js.native
  }
  object Events {
    
    @JSImport("@hapi/teamwork", "Events.Iterator")
    @js.native
    class Iterator[T] protected ()
      extends AsyncIterator[T, js.Any, js.UndefOr[scala.Nothing]] {
      def this(events: Events[T]) = this()
      
      def next(): js.Promise[IteratorResult[T, _]] = js.native
    }
  }
  
  @JSImport("@hapi/teamwork", "Team")
  @js.native
  /**
    * Start a new team work.
    *
    * @param options Configuration of the team work.
    */
  class Team[Results /* <: js.Any | js.Array[_] */] () extends StObject {
    def this(options: Options) = this()
    
    /**
      * Attend a single meeting.
      *
      * @param note An optional note that will be included in the work's results. If an error is provided, the work will be immediately rejected with that error.
      */
    def attend(): Unit = js.native
    def attend(note: js.Error): Unit = js.native
    def attend(note: ElementOf[Results]): Unit = js.native
    
    /**
      * Wait for the current work to be done and start another team work.
      *
      * @param options New configuration of the team work.
      *
      * @returns a promise that resolves when the current work is done.
      */
    def regroup(): js.Promise[Unit] = js.native
    def regroup(options: Options): js.Promise[Unit] = js.native
    
    /**
      * Resulting work when all the meetings are done.
      */
    var work: js.Promise[Results] = js.native
  }
  object Team {
    
    type ElementOf[T] = T
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Number of meetings this team should attend before delivering work.
        *
        * @default 1
        */
      val meetings: js.UndefOr[Double] = js.native
      
      /**
        * Throws when the team attends more than the expected number of `meetings`.
        *
        * @default false
        */
      val strict: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMeetings(value: Double): Self = StObject.set(x, "meetings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeetingsUndefined: Self = StObject.set(x, "meetings", js.undefined)
        
        @scala.inline
        def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
  }
}
