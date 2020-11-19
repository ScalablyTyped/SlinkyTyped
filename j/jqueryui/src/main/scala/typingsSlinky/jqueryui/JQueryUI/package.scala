package typingsSlinky.jqueryui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JQueryUI {
  
  type AccordionEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.AccordionUIParams, 
    scala.Unit
  ]
  
  type AutocompleteEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.AutocompleteUIParams, 
    scala.Unit
  ]
  
  type DialogEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.DialogUIParams, 
    scala.Unit
  ]
  
  type DraggableEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.DraggableEventUIParams, 
    scala.Unit
  ]
  
  type DroppableEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.DroppableEventUIParam, 
    scala.Unit
  ]
  
  type MenuEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.MenuUIParams, 
    scala.Unit
  ]
  
  type ProgressbarEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.ProgressbarUIParams, 
    scala.Unit
  ]
  
  type ResizableEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.ResizableUIParams, 
    scala.Unit
  ]
  
  type SelectMenuEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.SelectMenuUIParams, 
    scala.Unit
  ]
  
  type SliderEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.SliderUIParams, 
    scala.Unit
  ]
  
  type SortableEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.SortableUIParams, 
    scala.Unit
  ]
  
  type SpinnerEvent[T] = js.Function2[/* event */ typingsSlinky.jquery.JQueryEventObject, /* ui */ T, scala.Unit]
  
  type TabsEvent[UI] = js.Function2[/* event */ typingsSlinky.jquery.JQueryEventObject, /* ui */ UI, scala.Unit]
  
  type TooltipEvent = js.Function2[
    /* event */ typingsSlinky.jquery.JQueryEventObject, 
    /* ui */ typingsSlinky.jqueryui.JQueryUI.TooltipUIParams, 
    scala.Unit
  ]
}
