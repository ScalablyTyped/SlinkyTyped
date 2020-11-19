package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object triggersTypesMod {
  
  type CreateTrigger = typingsSlinky.nodePgMigrate.triggersTypesMod.CreateTriggerFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateTriggerFn
  
  type CreateTriggerFn = typingsSlinky.nodePgMigrate.triggersTypesMod.CreateTriggerFn1 | typingsSlinky.nodePgMigrate.triggersTypesMod.CreateTriggerFn2
  
  type CreateTriggerFn1 = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* triggerName */ java.lang.String, 
    /* triggerOptions */ typingsSlinky.nodePgMigrate.triggersTypesMod.TriggerOptions with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateTriggerFn2 = js.Function4[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* triggerName */ java.lang.String, 
    /* triggerOptions */ typingsSlinky.nodePgMigrate.triggersTypesMod.TriggerOptions with typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionOptions with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions, 
    /* definition */ typingsSlinky.nodePgMigrate.generalTypesMod.Value, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropTrigger = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* triggerName */ java.lang.String, 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameTrigger = typingsSlinky.nodePgMigrate.triggersTypesMod.RenameTriggerFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameTriggerFn
  
  type RenameTriggerFn = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* oldTriggerName */ java.lang.String, 
    /* newTriggerName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
