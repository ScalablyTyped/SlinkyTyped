package typingsSlinky.cqrsDomain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(options: typingsSlinky.cqrsDomain.mod.CreateDomainOptions): typingsSlinky.cqrsDomain.mod.CqrsDomain = typingsSlinky.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.cqrsDomain.mod.CqrsDomain]
  
  /**
    * @param changed is the new aggregate object
    * @param previous is the old aggregate object
    * @param events is the array with the resulting events
    * @param command the handling command
    * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
    */
  type businessRuleHandler = js.Function4[
    /* changed */ typingsSlinky.cqrsDomain.mod.AggregateModel, 
    /* previous */ typingsSlinky.cqrsDomain.mod.AggregateModel, 
    /* command */ js.Any, 
    /* callback */ js.UndefOr[js.Function1[/* err */ java.lang.String | js.Error, java.lang.String | js.Error]], 
    scala.Unit | java.lang.String | js.Error
  ]
  
  type commandHandler = js.Function2[
    /* data */ js.Any, 
    /* aggregate */ typingsSlinky.cqrsDomain.mod.AggregateModel, 
    scala.Unit
  ]
  
  /**
    * @param aggId is the aggregate id
    * @param cmd is the command data
    * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
    */
  type commandHandlerHandler = js.Function4[
    /* aggId */ java.lang.String, 
    /* cmd */ js.Any, 
    /* commandHandler */ js.Any, 
    /* callback */ js.UndefOr[js.Function1[/* err */ java.lang.String | js.Error, java.lang.String | js.Error]], 
    scala.Unit | java.lang.String | js.Error
  ]
  
  @scala.inline
  def defineAggregate(options: typingsSlinky.cqrsDomain.mod.DefineAggregateOptions): typingsSlinky.cqrsDomain.mod.DefineAggregateResult = typingsSlinky.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineAggregate")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.cqrsDomain.mod.DefineAggregateResult]
  @scala.inline
  def defineAggregate(options: typingsSlinky.cqrsDomain.mod.DefineAggregateOptions, initializationData: js.Any): typingsSlinky.cqrsDomain.mod.DefineAggregateResult = (typingsSlinky.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineAggregate")(options.asInstanceOf[js.Any], initializationData.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cqrsDomain.mod.DefineAggregateResult]
  
  @scala.inline
  def defineBusinessRule(
    options: typingsSlinky.cqrsDomain.mod.DefineBusinessRuleOptions,
    handler: typingsSlinky.cqrsDomain.mod.businessRuleHandler
  ): scala.Unit = (typingsSlinky.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineBusinessRule")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def defineCommand(
    options: typingsSlinky.cqrsDomain.mod.DefineCommandOptions,
    handler: typingsSlinky.cqrsDomain.mod.commandHandler
  ): typingsSlinky.cqrsDomain.mod.DefineCommandResult = (typingsSlinky.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineCommand")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cqrsDomain.mod.DefineCommandResult]
  
  @scala.inline
  def defineCommandHandler(
    options: typingsSlinky.cqrsDomain.mod.DefineCommandHandlerOptions,
    handler: typingsSlinky.cqrsDomain.mod.commandHandlerHandler
  ): scala.Unit = (typingsSlinky.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineCommandHandler")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def defineContext(options: typingsSlinky.cqrsDomain.mod.DefineAggregateOptions): scala.Unit = typingsSlinky.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineContext")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def defineEvent(
    options: typingsSlinky.cqrsDomain.mod.DefineEventOptions,
    handler: typingsSlinky.cqrsDomain.mod.eventHandler
  ): scala.Unit = (typingsSlinky.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineEvent")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  type defineEventStreamsToLoadHandler = js.Function1[/* cmd */ js.Any, js.Array[typingsSlinky.cqrsDomain.anon.Aggregate]]
  
  @scala.inline
  def definePreCondition(
    options: typingsSlinky.cqrsDomain.mod.DefinePreConditionOptions,
    handler: typingsSlinky.cqrsDomain.mod.preConditionHandler
  ): scala.Unit = (typingsSlinky.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("definePreCondition")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def definePreLoadCondition(
    options: typingsSlinky.cqrsDomain.mod.DefinePreLoadConditionOptions,
    handler: typingsSlinky.cqrsDomain.mod.preLoadConditionHandler
  ): scala.Unit = (typingsSlinky.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("definePreLoadCondition")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * @param loadingTime is the loading time in ms of the eventstore data
    * @param events are all loaded events in an array
    * @param aggregateData represents the aggregateData after applying the resulting events
    */
  type defineSnapshotNeedHandler = js.Function3[
    /* loadingTime */ scala.Double, 
    /* events */ js.Array[js.Any], 
    /* aggregateData */ js.Any, 
    scala.Boolean
  ]
  
  type eventHandler = js.Function2[
    /* data */ js.Any, 
    /* aggregate */ typingsSlinky.cqrsDomain.mod.AggregateModel, 
    scala.Unit
  ]
  
  // endregion
  // region extendValidator
  @scala.inline
  def extendValidator(cb: js.Function1[/* validator */ js.Any, scala.Unit]): scala.Unit = typingsSlinky.cqrsDomain.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendValidator")(cb.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  type generateIdCallback = js.Function2[/* err */ js.Any, /* id */ java.lang.String, scala.Unit]
  
  /**
    * @param data is the command data
    * @param aggregate is the aggregate object
    * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
    */
  type preConditionHandler = js.Function3[
    /* data */ js.Any, 
    /* aggregate */ typingsSlinky.cqrsDomain.mod.AggregateModel, 
    /* callback */ js.UndefOr[js.Function1[/* err */ java.lang.String | js.Error, java.lang.String | js.Error]], 
    scala.Unit | java.lang.String | js.Error
  ]
  
  /**
    * @param data is the command data
    * @param callback is optional, if not defined as function argument you can throw errors or return errors here (sync way)
    */
  type preLoadConditionHandler = js.Function2[
    /* data */ js.Any, 
    /* callback */ js.UndefOr[js.Function1[/* err */ java.lang.String | js.Error, java.lang.String | js.Error]], 
    scala.Unit | java.lang.String | js.Error
  ]
}
