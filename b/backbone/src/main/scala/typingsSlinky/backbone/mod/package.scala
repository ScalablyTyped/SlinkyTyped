package typingsSlinky.backbone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CombinedModelConstructorOptions[E, M /* <: typingsSlinky.backbone.mod.Model[_, _, E] */] = typingsSlinky.backbone.mod.ModelConstructorOptions[M] with E
  
  /**
    * JavaScript events (used in the methods of the Events interface)
    */
  type EventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type EventMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.backbone.mod.EventHandler]
  
  @scala.inline
  def Events: typingsSlinky.backbone.mod.Events = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Events").asInstanceOf[typingsSlinky.backbone.mod.Events]
  
  /**
    * DOM events (used in the events property of a View)
    */
  type EventsHash = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | (js.Function1[
      /* eventObject */ typingsSlinky.jquery.JQuery.TriggeredEvent[js.Any, js.Any, js.Any, js.Any], 
      scala.Unit
    ])
  ]
  
  type EventsOff[BaseT] = js.ThisFunction3[
    /* this */ BaseT, 
    /* eventName */ js.UndefOr[java.lang.String], 
    /* callback */ js.UndefOr[typingsSlinky.backbone.mod.EventHandler], 
    /* context */ js.UndefOr[js.Any], 
    BaseT
  ]
  
  type EventsStop[BaseT] = js.ThisFunction3[
    /* this */ BaseT, 
    /* object */ js.UndefOr[js.Any], 
    /* events */ js.UndefOr[java.lang.String], 
    /* callback */ js.UndefOr[typingsSlinky.backbone.mod.EventHandler], 
    BaseT
  ]
  
  type EventsTrigger[BaseT] = js.ThisFunction2[/* this */ BaseT, /* eventName */ java.lang.String, /* repeated */ js.Any, BaseT]
  
  type ObjectHash = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type RoutesHash = org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* repeated */ java.lang.String, scala.Unit])]
  
  @scala.inline
  def _empty: typingsSlinky.jquery.JQueryStatic = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].selectDynamic("$").asInstanceOf[typingsSlinky.jquery.JQueryStatic]
  @scala.inline
  def _empty_=(x: typingsSlinky.jquery.JQueryStatic): scala.Unit = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].updateDynamic("$")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def ajax(): typingsSlinky.jquery.JQueryXHR = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ajax")().asInstanceOf[typingsSlinky.jquery.JQueryXHR]
  @scala.inline
  def ajax(options: typingsSlinky.jquery.JQueryAjaxSettings): typingsSlinky.jquery.JQueryXHR = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jquery.JQueryXHR]
  
  @scala.inline
  def emulateHTTP: scala.Boolean = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].selectDynamic("emulateHTTP").asInstanceOf[scala.Boolean]
  @scala.inline
  def emulateHTTP_=(x: scala.Boolean): scala.Unit = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].updateDynamic("emulateHTTP")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def emulateJSON: scala.Boolean = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].selectDynamic("emulateJSON").asInstanceOf[scala.Boolean]
  @scala.inline
  def emulateJSON_=(x: scala.Boolean): scala.Unit = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].updateDynamic("emulateJSON")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def history: typingsSlinky.backbone.mod.History_ = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].selectDynamic("history").asInstanceOf[typingsSlinky.backbone.mod.History_]
  @scala.inline
  def history_=(x: typingsSlinky.backbone.mod.History_): scala.Unit = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
  
  // Utility
  @scala.inline
  def noConflict(): typingsSlinky.backbone.anon.Typeofbackbone = typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[typingsSlinky.backbone.anon.Typeofbackbone]
  
  @scala.inline
  def sync(
    method: java.lang.String,
    model: typingsSlinky.backbone.mod.Collection[
      typingsSlinky.backbone.mod.Model[_, typingsSlinky.backbone.mod.ModelSetOptions, js.Object]
    ]
  ): js.Any = (typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def sync(
    method: java.lang.String,
    model: typingsSlinky.backbone.mod.Collection[
      typingsSlinky.backbone.mod.Model[_, typingsSlinky.backbone.mod.ModelSetOptions, js.Object]
    ],
    options: typingsSlinky.jquery.JQueryAjaxSettings
  ): js.Any = (typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  // SYNC
  @scala.inline
  def sync(
    method: java.lang.String,
    model: typingsSlinky.backbone.mod.Model[_, typingsSlinky.backbone.mod.ModelSetOptions, js.Object]
  ): js.Any = (typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def sync(
    method: java.lang.String,
    model: typingsSlinky.backbone.mod.Model[_, typingsSlinky.backbone.mod.ModelSetOptions, js.Object],
    options: typingsSlinky.jquery.JQueryAjaxSettings
  ): js.Any = (typingsSlinky.backbone.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
