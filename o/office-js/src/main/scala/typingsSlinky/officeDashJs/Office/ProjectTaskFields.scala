package typingsSlinky.officeDashJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectTaskFields extends js.Object

/**
  * Specifies the task fields that are available as a parameter for the {@link Office.Document | Document}.getTaskFieldAsync method.
  *
  * @remarks
  * 
  * A ProjectTaskFields constant can be used as a parameter of the {@link Office.Document | Document}.getTaskFieldAsync method.
  *
  * For more information about working with fields in Project, see the 
  * {@link https://support.office.com/article/Available-fields-reference-615a4563-1cc3-40f4-b66f-1b17e793a460 | Available fields} reference. 
  * In Project Help, search for Available fields.
  */
@JSGlobal("Office.ProjectTaskFields")
@js.native
object ProjectTaskFields extends js.Object {
  /**
    * Indicates whether the task is active.
    */
  @js.native
  sealed trait Active extends ProjectTaskFields
  
  /**
    * The current actual cost for the task.
    */
  @js.native
  sealed trait ActualCost extends ProjectTaskFields
  
  /**
    * The actual duration of the task, in minutes.
    */
  @js.native
  sealed trait ActualDuration extends ProjectTaskFields
  
  /**
    * The actual finish date of the task.
    */
  @js.native
  sealed trait ActualFinish extends ProjectTaskFields
  
  /**
    * The actual overtime cost for the task.
    */
  @js.native
  sealed trait ActualOvertimeCost extends ProjectTaskFields
  
  /**
    * The actual overtime work for the task, in minutes.
    */
  @js.native
  sealed trait ActualOvertimeWork extends ProjectTaskFields
  
  /**
    * The actual start date of the task.
    */
  @js.native
  sealed trait ActualStart extends ProjectTaskFields
  
  /**
    * The actual work for the task, in minutes.
    */
  @js.native
  sealed trait ActualWork extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline10BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline10BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline10Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline10Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline10Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline10FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline10FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline10Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline10Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline1BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline1BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline1Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline1Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline1Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline1FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline1FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline1Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline1Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline2BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline2BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline2Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline2Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline2Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline2FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline2FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline2Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline2Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline3BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline3BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline3Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline3Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline3Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline3FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline3FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline3Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline3Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline4BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline4BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline4Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline4Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline4Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline4FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline4FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline4Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline4Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline5BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline5BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline5Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline5Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline5Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline5FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline5FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline5Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline5Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline6BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline6BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline6Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline6Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline6Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline6FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline6FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline6Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline6Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline7BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline7BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline7Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline7Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline7Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline7FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline7FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline7Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline7Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline8BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline8BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline8Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline8Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline8Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline8FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline8FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline8Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline8Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait Baseline9BudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait Baseline9BudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait Baseline9Cost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline9Duration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait Baseline9Finish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait Baseline9FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait Baseline9FixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait Baseline9Start extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait Baseline9Work extends ProjectTaskFields
  
  /**
    * The budget cost for the baseline task.
    */
  @js.native
  sealed trait BaselineBudgetCost extends ProjectTaskFields
  
  /**
    * The budget work for the baseline task, in hours.
    */
  @js.native
  sealed trait BaselineBudgetWork extends ProjectTaskFields
  
  /**
    * The cost for the baseline task.
    */
  @js.native
  sealed trait BaselineCost extends ProjectTaskFields
  
  /**
    * The duration for the baseline task, in minutes.
    */
  @js.native
  sealed trait BaselineDuration extends ProjectTaskFields
  
  /**
    * The finish date for the baseline task.
    */
  @js.native
  sealed trait BaselineFinish extends ProjectTaskFields
  
  /**
    * The fixed cost of any non-resource expense for the baseline task.
    */
  @js.native
  sealed trait BaselineFixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait BaselineFixedCostAccrual extends ProjectTaskFields
  
  /**
    * The start date for the baseline task.
    */
  @js.native
  sealed trait BaselineStart extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the baseline task, in minutes.
    */
  @js.native
  sealed trait BaselineWork extends ProjectTaskFields
  
  /**
    * The budget cost for the task.
    */
  @js.native
  sealed trait BudgetCost extends ProjectTaskFields
  
  @js.native
  sealed trait BudgetFixedCost extends ProjectTaskFields
  
  @js.native
  sealed trait BudgetFixedWork extends ProjectTaskFields
  
  /**
    * The budget work for the task, in hours.
    */
  @js.native
  sealed trait BudgetWork extends ProjectTaskFields
  
  /**
    * A constraint date for the task.
    */
  @js.native
  sealed trait ConstraintDate extends ProjectTaskFields
  
  /**
    * A constraint type for the task: As Soon As Possible = 0, As Late As Possible = 1, Must Start On = 2, Must Finish On = 3, 
    * Start No Earlier Than = 4, Start No Later Than = 5, Finish No Earlier Than = 6, Finish No Later Than = 7.
    */
  @js.native
  sealed trait ConstraintType extends ProjectTaskFields
  
  /**
    * The total cost of the task.
    */
  @js.native
  sealed trait Cost extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost1 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost10 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost2 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost3 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost4 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost5 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost6 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost7 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost8 extends ProjectTaskFields
  
  /**
    * A cost field of the task.
    */
  @js.native
  sealed trait Cost9 extends ProjectTaskFields
  
  /**
    * Indicates whether the task is on the critical path.
    */
  @js.native
  sealed trait Critical extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date1 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date10 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date2 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date3 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date4 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date5 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date6 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date7 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date8 extends ProjectTaskFields
  
  /**
    * A date field of the task.
    */
  @js.native
  sealed trait Date9 extends ProjectTaskFields
  
  /**
    * The deadline for a task.
    */
  @js.native
  sealed trait Deadline extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration1 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration10 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration2 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration3 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration4 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration5 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration6 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration7 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration8 extends ProjectTaskFields
  
  /**
    * A duration field of the task.
    */
  @js.native
  sealed trait Duration9 extends ProjectTaskFields
  
  /**
    * The method for calculating earned value for the task.
    */
  @js.native
  sealed trait EarnedValueMethod extends ProjectTaskFields
  
  /**
    * The finish date of the task.
    */
  @js.native
  sealed trait Finish extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish1 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish10 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish2 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish3 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish4 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish5 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish6 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish7 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish8 extends ProjectTaskFields
  
  /**
    * A finish field for the task.
    */
  @js.native
  sealed trait Finish9 extends ProjectTaskFields
  
  /**
    * The duration between the Early Finish and Late Finish dates for the task, in minutes.
    */
  @js.native
  sealed trait FinishSlack extends ProjectTaskFields
  
  /**
    * The fixed cost for the task.
    */
  @js.native
  sealed trait FixedCost extends ProjectTaskFields
  
  /**
    * The accrual method that defines how the baseline task accrues fixed costs: Accrues when the task starts = 1, 
    * accrues when the task ends = 2, accrues as the task progresses (prorated) = 3.
    */
  @js.native
  sealed trait FixedCostAccrual extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag1 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag10 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag11 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag12 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag13 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag14 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag15 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag16 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag17 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag18 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag19 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag2 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag20 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag3 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag4 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag5 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag6 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag7 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag8 extends ProjectTaskFields
  
  /**
    * A Boolean flag field for the task.
    */
  @js.native
  sealed trait Flag9 extends ProjectTaskFields
  
  /**
    * The amount of time that the task can be delayed without delaying its successor tasks.
    */
  @js.native
  sealed trait FreeSlack extends ProjectTaskFields
  
  /**
    * Indicates whether the task has rollup subtasks.
    */
  @js.native
  sealed trait HasRollupSubTasks extends ProjectTaskFields
  
  /**
    * The index of the selected task. After the project summary task, the index of the first task in a project is 1.
    */
  @js.native
  sealed trait ID extends ProjectTaskFields
  
  /**
    * Indicates whether subtask information is rolled up to the summary task bar.
    */
  @js.native
  sealed trait IsRollup extends ProjectTaskFields
  
  /**
    * Indicates whether the task is a milestone.
    */
  @js.native
  sealed trait Milestone extends ProjectTaskFields
  
  /**
    * The name of the task.
    */
  @js.native
  sealed trait Name extends ProjectTaskFields
  
  /**
    * The text value of the notes regarding the task.
    */
  @js.native
  sealed trait Notes extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number1 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number10 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number11 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number12 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number13 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number14 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number15 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number16 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number17 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number18 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number19 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number2 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number20 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number3 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number4 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number5 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number6 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number7 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number8 extends ProjectTaskFields
  
  /**
    * A number field for the task.
    */
  @js.native
  sealed trait Number9 extends ProjectTaskFields
  
  /**
    * The level of the task in the outline hierarchy.
    */
  @js.native
  sealed trait OutlineLevel extends ProjectTaskFields
  
  /**
    * Indicates whether any assignments for a task are overallocated.
    */
  @js.native
  sealed trait Overallocated extends ProjectTaskFields
  
  /**
    * The overtime cost for the task.
    */
  @js.native
  sealed trait OvertimeCost extends ProjectTaskFields
  
  /**
    * The overtime work for the task.
    */
  @js.native
  sealed trait OvertimeWork extends ProjectTaskFields
  
  /**
    * The percent complete status of the task.
    */
  @js.native
  sealed trait PercentComplete extends ProjectTaskFields
  
  /**
    * The percentage of work completed for the task.
    */
  @js.native
  sealed trait PercentWorkComplete extends ProjectTaskFields
  
  /**
    * The IDs of the task's predecessors.
    */
  @js.native
  sealed trait Predecessors extends ProjectTaskFields
  
  /**
    * The finish date of a task before leveling occurred.
    */
  @js.native
  sealed trait PreleveledFinish extends ProjectTaskFields
  
  /**
    * The start date of a task before leveling occurred.
    */
  @js.native
  sealed trait PreleveledStart extends ProjectTaskFields
  
  /**
    * The priority of the task, with values from 0 (low) to 1000 (high). The default priority value is 500.
    */
  @js.native
  sealed trait Priority extends ProjectTaskFields
  
  /**
    * The amount of regular work for the task.
    */
  @js.native
  sealed trait RegularWork extends ProjectTaskFields
  
  /**
    * The remaining cost for the task.
    */
  @js.native
  sealed trait RemainingCost extends ProjectTaskFields
  
  /**
    * The remaining duration for the task, in minutes.
    */
  @js.native
  sealed trait RemainingDuration extends ProjectTaskFields
  
  /**
    * The remaining overtime cost for the task.
    */
  @js.native
  sealed trait RemainingOvertimeCost extends ProjectTaskFields
  
  /**
    * The remaining work for the task, in minutes.
    */
  @js.native
  sealed trait RemainingWork extends ProjectTaskFields
  
  /**
    * The names of the resources assigned to a task.
    */
  @js.native
  sealed trait ResourceNames extends ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) duration of the task.
    */
  @js.native
  sealed trait ScheduledDuration extends ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) finish date of the task.
    */
  @js.native
  sealed trait ScheduledFinish extends ProjectTaskFields
  
  /**
    * The scheduled (as opposed to actual) start date of the task.
    */
  @js.native
  sealed trait ScheduledStart extends ProjectTaskFields
  
  /**
    * The start date of the task.
    */
  @js.native
  sealed trait Start extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start1 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start10 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start2 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start3 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start4 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start5 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start6 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start7 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start8 extends ProjectTaskFields
  
  /**
    * A start field for the task.
    */
  @js.native
  sealed trait Start9 extends ProjectTaskFields
  
  /**
    * The duration between the Early Start and Late Start dates for the task.
    */
  @js.native
  sealed trait StartSlack extends ProjectTaskFields
  
  /**
    * The status of the task: Complete = 0, on schedule = 1, late = 2, future task = 3, status not available = 4.
    */
  @js.native
  sealed trait Status extends ProjectTaskFields
  
  /**
    * The enterprise resource responsible for accepting or rejecting assignment progress updates for the task.
    */
  @js.native
  sealed trait StatusManager extends ProjectTaskFields
  
  /**
    * The IDs of the task's successors.
    */
  @js.native
  sealed trait Successors extends ProjectTaskFields
  
  /**
    * Indicates whether the task is a summary task.
    */
  @js.native
  sealed trait Summary extends ProjectTaskFields
  
  /**
    * The GUID of the task calendar.
    */
  @js.native
  sealed trait TaskCalendarGUID extends ProjectTaskFields
  
  /**
    * The GUID of the task.
    */
  @js.native
  sealed trait TaskGUID extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text1 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text10 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text11 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text12 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text13 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text14 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text15 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text16 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text17 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text18 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text19 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text2 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text20 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text21 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text22 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text23 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text24 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text25 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text26 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text27 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text28 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text29 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text3 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text30 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text4 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text5 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text6 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text7 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text8 extends ProjectTaskFields
  
  /**
    * A text field for the task.
    */
  @js.native
  sealed trait Text9 extends ProjectTaskFields
  
  /**
    * The total slack time for the task, in minutes.
    */
  @js.native
  sealed trait TotalSlack extends ProjectTaskFields
  
  /**
    * The way the task is calculated: Fixed units = 0, fixed duration = 1, fixed work = 2.
    */
  @js.native
  sealed trait Type extends ProjectTaskFields
  
  /**
    * The work breakdown structure code of the task.
    */
  @js.native
  sealed trait WBS extends ProjectTaskFields
  
  /**
    * The work breakdown structure codes of the task predecessors, separated by the list separator.
    */
  @js.native
  sealed trait WBSPREDECESSORS extends ProjectTaskFields
  
  /**
    * The work breakdown structure codes of the task successors, separated by the list separator.
    */
  @js.native
  sealed trait WBSSUCCESSORS extends ProjectTaskFields
  
  /**
    * The ID of the task in a SharePoint list, for a project that is synchronized with a SharePoint tasks list.
    */
  @js.native
  sealed trait WSSID extends ProjectTaskFields
  
  /**
    * The total person-hours scheduled for the task, in minutes.
    */
  @js.native
  sealed trait Work extends ProjectTaskFields
  
  /* 256 */ val Active: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Active with Double = js.native
  /* 0 */ val ActualCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ActualCost with Double = js.native
  /* 1 */ val ActualDuration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ActualDuration with Double = js.native
  /* 2 */ val ActualFinish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ActualFinish with Double = js.native
  /* 3 */ val ActualOvertimeCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ActualOvertimeCost with Double = js.native
  /* 4 */ val ActualOvertimeWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ActualOvertimeWork with Double = js.native
  /* 5 */ val ActualStart: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ActualStart with Double = js.native
  /* 6 */ val ActualWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ActualWork with Double = js.native
  /* 57 */ val Baseline10BudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline10BudgetCost with Double = js.native
  /* 58 */ val Baseline10BudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline10BudgetWork with Double = js.native
  /* 59 */ val Baseline10Cost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline10Cost with Double = js.native
  /* 60 */ val Baseline10Duration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline10Duration with Double = js.native
  /* 61 */ val Baseline10Finish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline10Finish with Double = js.native
  /* 62 */ val Baseline10FixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline10FixedCost with Double = js.native
  /* 63 */ val Baseline10FixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline10FixedCostAccrual with Double = js.native
  /* 64 */ val Baseline10Start: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline10Start with Double = js.native
  /* 65 */ val Baseline10Work: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline10Work with Double = js.native
  /* 66 */ val Baseline1BudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline1BudgetCost with Double = js.native
  /* 67 */ val Baseline1BudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline1BudgetWork with Double = js.native
  /* 68 */ val Baseline1Cost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline1Cost with Double = js.native
  /* 69 */ val Baseline1Duration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline1Duration with Double = js.native
  /* 70 */ val Baseline1Finish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline1Finish with Double = js.native
  /* 71 */ val Baseline1FixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline1FixedCost with Double = js.native
  /* 72 */ val Baseline1FixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline1FixedCostAccrual with Double = js.native
  /* 73 */ val Baseline1Start: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline1Start with Double = js.native
  /* 74 */ val Baseline1Work: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline1Work with Double = js.native
  /* 75 */ val Baseline2BudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline2BudgetCost with Double = js.native
  /* 76 */ val Baseline2BudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline2BudgetWork with Double = js.native
  /* 77 */ val Baseline2Cost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline2Cost with Double = js.native
  /* 78 */ val Baseline2Duration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline2Duration with Double = js.native
  /* 79 */ val Baseline2Finish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline2Finish with Double = js.native
  /* 80 */ val Baseline2FixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline2FixedCost with Double = js.native
  /* 81 */ val Baseline2FixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline2FixedCostAccrual with Double = js.native
  /* 82 */ val Baseline2Start: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline2Start with Double = js.native
  /* 83 */ val Baseline2Work: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline2Work with Double = js.native
  /* 84 */ val Baseline3BudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline3BudgetCost with Double = js.native
  /* 85 */ val Baseline3BudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline3BudgetWork with Double = js.native
  /* 86 */ val Baseline3Cost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline3Cost with Double = js.native
  /* 87 */ val Baseline3Duration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline3Duration with Double = js.native
  /* 88 */ val Baseline3Finish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline3Finish with Double = js.native
  /* 89 */ val Baseline3FixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline3FixedCost with Double = js.native
  /* 90 */ val Baseline3FixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline3FixedCostAccrual with Double = js.native
  /* 91 */ val Baseline3Start: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline3Start with Double = js.native
  /* 92 */ val Baseline3Work: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline3Work with Double = js.native
  /* 93 */ val Baseline4BudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline4BudgetCost with Double = js.native
  /* 94 */ val Baseline4BudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline4BudgetWork with Double = js.native
  /* 95 */ val Baseline4Cost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline4Cost with Double = js.native
  /* 96 */ val Baseline4Duration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline4Duration with Double = js.native
  /* 97 */ val Baseline4Finish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline4Finish with Double = js.native
  /* 98 */ val Baseline4FixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline4FixedCost with Double = js.native
  /* 99 */ val Baseline4FixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline4FixedCostAccrual with Double = js.native
  /* 100 */ val Baseline4Start: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline4Start with Double = js.native
  /* 101 */ val Baseline4Work: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline4Work with Double = js.native
  /* 102 */ val Baseline5BudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline5BudgetCost with Double = js.native
  /* 103 */ val Baseline5BudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline5BudgetWork with Double = js.native
  /* 104 */ val Baseline5Cost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline5Cost with Double = js.native
  /* 105 */ val Baseline5Duration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline5Duration with Double = js.native
  /* 106 */ val Baseline5Finish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline5Finish with Double = js.native
  /* 107 */ val Baseline5FixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline5FixedCost with Double = js.native
  /* 108 */ val Baseline5FixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline5FixedCostAccrual with Double = js.native
  /* 109 */ val Baseline5Start: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline5Start with Double = js.native
  /* 110 */ val Baseline5Work: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline5Work with Double = js.native
  /* 111 */ val Baseline6BudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline6BudgetCost with Double = js.native
  /* 112 */ val Baseline6BudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline6BudgetWork with Double = js.native
  /* 113 */ val Baseline6Cost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline6Cost with Double = js.native
  /* 114 */ val Baseline6Duration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline6Duration with Double = js.native
  /* 115 */ val Baseline6Finish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline6Finish with Double = js.native
  /* 116 */ val Baseline6FixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline6FixedCost with Double = js.native
  /* 117 */ val Baseline6FixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline6FixedCostAccrual with Double = js.native
  /* 118 */ val Baseline6Start: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline6Start with Double = js.native
  /* 119 */ val Baseline6Work: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline6Work with Double = js.native
  /* 120 */ val Baseline7BudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline7BudgetCost with Double = js.native
  /* 121 */ val Baseline7BudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline7BudgetWork with Double = js.native
  /* 122 */ val Baseline7Cost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline7Cost with Double = js.native
  /* 123 */ val Baseline7Duration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline7Duration with Double = js.native
  /* 124 */ val Baseline7Finish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline7Finish with Double = js.native
  /* 125 */ val Baseline7FixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline7FixedCost with Double = js.native
  /* 126 */ val Baseline7FixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline7FixedCostAccrual with Double = js.native
  /* 127 */ val Baseline7Start: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline7Start with Double = js.native
  /* 128 */ val Baseline7Work: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline7Work with Double = js.native
  /* 129 */ val Baseline8BudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline8BudgetCost with Double = js.native
  /* 130 */ val Baseline8BudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline8BudgetWork with Double = js.native
  /* 131 */ val Baseline8Cost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline8Cost with Double = js.native
  /* 132 */ val Baseline8Duration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline8Duration with Double = js.native
  /* 133 */ val Baseline8Finish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline8Finish with Double = js.native
  /* 134 */ val Baseline8FixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline8FixedCost with Double = js.native
  /* 135 */ val Baseline8FixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline8FixedCostAccrual with Double = js.native
  /* 136 */ val Baseline8Start: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline8Start with Double = js.native
  /* 137 */ val Baseline8Work: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline8Work with Double = js.native
  /* 138 */ val Baseline9BudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline9BudgetCost with Double = js.native
  /* 139 */ val Baseline9BudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline9BudgetWork with Double = js.native
  /* 140 */ val Baseline9Cost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline9Cost with Double = js.native
  /* 141 */ val Baseline9Duration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline9Duration with Double = js.native
  /* 142 */ val Baseline9Finish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline9Finish with Double = js.native
  /* 143 */ val Baseline9FixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline9FixedCost with Double = js.native
  /* 144 */ val Baseline9FixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline9FixedCostAccrual with Double = js.native
  /* 145 */ val Baseline9Start: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline9Start with Double = js.native
  /* 146 */ val Baseline9Work: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Baseline9Work with Double = js.native
  /* 147 */ val BaselineBudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BaselineBudgetCost with Double = js.native
  /* 148 */ val BaselineBudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BaselineBudgetWork with Double = js.native
  /* 149 */ val BaselineCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BaselineCost with Double = js.native
  /* 150 */ val BaselineDuration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BaselineDuration with Double = js.native
  /* 151 */ val BaselineFinish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BaselineFinish with Double = js.native
  /* 152 */ val BaselineFixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BaselineFixedCost with Double = js.native
  /* 153 */ val BaselineFixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BaselineFixedCostAccrual with Double = js.native
  /* 154 */ val BaselineStart: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BaselineStart with Double = js.native
  /* 155 */ val BaselineWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BaselineWork with Double = js.native
  /* 156 */ val BudgetCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BudgetCost with Double = js.native
  /* 157 */ val BudgetFixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BudgetFixedCost with Double = js.native
  /* 158 */ val BudgetFixedWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BudgetFixedWork with Double = js.native
  /* 159 */ val BudgetWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.BudgetWork with Double = js.native
  /* 161 */ val ConstraintDate: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ConstraintDate with Double = js.native
  /* 162 */ val ConstraintType: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ConstraintType with Double = js.native
  /* 268 */ val Cost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Cost with Double = js.native
  /* 163 */ val Cost1: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Cost1 with Double = js.native
  /* 164 */ val Cost10: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Cost10 with Double = js.native
  /* 165 */ val Cost2: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Cost2 with Double = js.native
  /* 166 */ val Cost3: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Cost3 with Double = js.native
  /* 167 */ val Cost4: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Cost4 with Double = js.native
  /* 168 */ val Cost5: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Cost5 with Double = js.native
  /* 169 */ val Cost6: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Cost6 with Double = js.native
  /* 170 */ val Cost7: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Cost7 with Double = js.native
  /* 171 */ val Cost8: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Cost8 with Double = js.native
  /* 172 */ val Cost9: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Cost9 with Double = js.native
  /* 257 */ val Critical: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Critical with Double = js.native
  /* 173 */ val Date1: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Date1 with Double = js.native
  /* 174 */ val Date10: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Date10 with Double = js.native
  /* 175 */ val Date2: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Date2 with Double = js.native
  /* 176 */ val Date3: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Date3 with Double = js.native
  /* 177 */ val Date4: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Date4 with Double = js.native
  /* 178 */ val Date5: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Date5 with Double = js.native
  /* 179 */ val Date6: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Date6 with Double = js.native
  /* 180 */ val Date7: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Date7 with Double = js.native
  /* 181 */ val Date8: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Date8 with Double = js.native
  /* 182 */ val Date9: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Date9 with Double = js.native
  /* 183 */ val Deadline: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Deadline with Double = js.native
  /* 194 */ val Duration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Duration with Double = js.native
  /* 184 */ val Duration1: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Duration1 with Double = js.native
  /* 185 */ val Duration10: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Duration10 with Double = js.native
  /* 186 */ val Duration2: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Duration2 with Double = js.native
  /* 187 */ val Duration3: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Duration3 with Double = js.native
  /* 188 */ val Duration4: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Duration4 with Double = js.native
  /* 189 */ val Duration5: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Duration5 with Double = js.native
  /* 190 */ val Duration6: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Duration6 with Double = js.native
  /* 191 */ val Duration7: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Duration7 with Double = js.native
  /* 192 */ val Duration8: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Duration8 with Double = js.native
  /* 193 */ val Duration9: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Duration9 with Double = js.native
  /* 195 */ val EarnedValueMethod: typingsSlinky.officeDashJs.Office.ProjectTaskFields.EarnedValueMethod with Double = js.native
  /* 269 */ val Finish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Finish with Double = js.native
  /* 20 */ val Finish1: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Finish1 with Double = js.native
  /* 9 */ val Finish10: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Finish10 with Double = js.native
  /* 33 */ val Finish2: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Finish2 with Double = js.native
  /* 37 */ val Finish3: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Finish3 with Double = js.native
  /* 40 */ val Finish4: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Finish4 with Double = js.native
  /* 43 */ val Finish5: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Finish5 with Double = js.native
  /* 46 */ val Finish6: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Finish6 with Double = js.native
  /* 49 */ val Finish7: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Finish7 with Double = js.native
  /* 52 */ val Finish8: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Finish8 with Double = js.native
  /* 55 */ val Finish9: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Finish9 with Double = js.native
  /* 196 */ val FinishSlack: typingsSlinky.officeDashJs.Office.ProjectTaskFields.FinishSlack with Double = js.native
  /* 197 */ val FixedCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.FixedCost with Double = js.native
  /* 198 */ val FixedCostAccrual: typingsSlinky.officeDashJs.Office.ProjectTaskFields.FixedCostAccrual with Double = js.native
  /* 200 */ val Flag1: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag1 with Double = js.native
  /* 199 */ val Flag10: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag10 with Double = js.native
  /* 201 */ val Flag11: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag11 with Double = js.native
  /* 202 */ val Flag12: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag12 with Double = js.native
  /* 203 */ val Flag13: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag13 with Double = js.native
  /* 204 */ val Flag14: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag14 with Double = js.native
  /* 205 */ val Flag15: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag15 with Double = js.native
  /* 206 */ val Flag16: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag16 with Double = js.native
  /* 207 */ val Flag17: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag17 with Double = js.native
  /* 208 */ val Flag18: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag18 with Double = js.native
  /* 209 */ val Flag19: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag19 with Double = js.native
  /* 210 */ val Flag2: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag2 with Double = js.native
  /* 211 */ val Flag20: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag20 with Double = js.native
  /* 212 */ val Flag3: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag3 with Double = js.native
  /* 213 */ val Flag4: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag4 with Double = js.native
  /* 214 */ val Flag5: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag5 with Double = js.native
  /* 215 */ val Flag6: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag6 with Double = js.native
  /* 216 */ val Flag7: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag7 with Double = js.native
  /* 217 */ val Flag8: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag8 with Double = js.native
  /* 218 */ val Flag9: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Flag9 with Double = js.native
  /* 219 */ val FreeSlack: typingsSlinky.officeDashJs.Office.ProjectTaskFields.FreeSlack with Double = js.native
  /* 220 */ val HasRollupSubTasks: typingsSlinky.officeDashJs.Office.ProjectTaskFields.HasRollupSubTasks with Double = js.native
  /* 221 */ val ID: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ID with Double = js.native
  /* 260 */ val IsRollup: typingsSlinky.officeDashJs.Office.ProjectTaskFields.IsRollup with Double = js.native
  /* 258 */ val Milestone: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Milestone with Double = js.native
  /* 222 */ val Name: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Name with Double = js.native
  /* 223 */ val Notes: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Notes with Double = js.native
  /* 224 */ val Number1: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number1 with Double = js.native
  /* 225 */ val Number10: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number10 with Double = js.native
  /* 226 */ val Number11: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number11 with Double = js.native
  /* 227 */ val Number12: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number12 with Double = js.native
  /* 228 */ val Number13: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number13 with Double = js.native
  /* 229 */ val Number14: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number14 with Double = js.native
  /* 230 */ val Number15: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number15 with Double = js.native
  /* 231 */ val Number16: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number16 with Double = js.native
  /* 232 */ val Number17: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number17 with Double = js.native
  /* 233 */ val Number18: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number18 with Double = js.native
  /* 234 */ val Number19: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number19 with Double = js.native
  /* 235 */ val Number2: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number2 with Double = js.native
  /* 236 */ val Number20: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number20 with Double = js.native
  /* 237 */ val Number3: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number3 with Double = js.native
  /* 238 */ val Number4: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number4 with Double = js.native
  /* 239 */ val Number5: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number5 with Double = js.native
  /* 240 */ val Number6: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number6 with Double = js.native
  /* 241 */ val Number7: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number7 with Double = js.native
  /* 242 */ val Number8: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number8 with Double = js.native
  /* 243 */ val Number9: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Number9 with Double = js.native
  /* 247 */ val OutlineLevel: typingsSlinky.officeDashJs.Office.ProjectTaskFields.OutlineLevel with Double = js.native
  /* 259 */ val Overallocated: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Overallocated with Double = js.native
  /* 248 */ val OvertimeCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.OvertimeCost with Double = js.native
  /* 249 */ val OvertimeWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.OvertimeWork with Double = js.native
  /* 250 */ val PercentComplete: typingsSlinky.officeDashJs.Office.ProjectTaskFields.PercentComplete with Double = js.native
  /* 251 */ val PercentWorkComplete: typingsSlinky.officeDashJs.Office.ProjectTaskFields.PercentWorkComplete with Double = js.native
  /* 252 */ val Predecessors: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Predecessors with Double = js.native
  /* 253 */ val PreleveledFinish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.PreleveledFinish with Double = js.native
  /* 254 */ val PreleveledStart: typingsSlinky.officeDashJs.Office.ProjectTaskFields.PreleveledStart with Double = js.native
  /* 255 */ val Priority: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Priority with Double = js.native
  /* 262 */ val RegularWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.RegularWork with Double = js.native
  /* 263 */ val RemainingCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.RemainingCost with Double = js.native
  /* 264 */ val RemainingDuration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.RemainingDuration with Double = js.native
  /* 265 */ val RemainingOvertimeCost: typingsSlinky.officeDashJs.Office.ProjectTaskFields.RemainingOvertimeCost with Double = js.native
  /* 266 */ val RemainingWork: typingsSlinky.officeDashJs.Office.ProjectTaskFields.RemainingWork with Double = js.native
  /* 267 */ val ResourceNames: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ResourceNames with Double = js.native
  /* 244 */ val ScheduledDuration: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ScheduledDuration with Double = js.native
  /* 245 */ val ScheduledFinish: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ScheduledFinish with Double = js.native
  /* 246 */ val ScheduledStart: typingsSlinky.officeDashJs.Office.ProjectTaskFields.ScheduledStart with Double = js.native
  /* 270 */ val Start: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Start with Double = js.native
  /* 21 */ val Start1: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Start1 with Double = js.native
  /* 10 */ val Start10: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Start10 with Double = js.native
  /* 34 */ val Start2: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Start2 with Double = js.native
  /* 38 */ val Start3: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Start3 with Double = js.native
  /* 41 */ val Start4: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Start4 with Double = js.native
  /* 44 */ val Start5: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Start5 with Double = js.native
  /* 47 */ val Start6: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Start6 with Double = js.native
  /* 50 */ val Start7: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Start7 with Double = js.native
  /* 53 */ val Start8: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Start8 with Double = js.native
  /* 56 */ val Start9: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Start9 with Double = js.native
  /* 272 */ val StartSlack: typingsSlinky.officeDashJs.Office.ProjectTaskFields.StartSlack with Double = js.native
  /* 273 */ val Status: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Status with Double = js.native
  /* 275 */ val StatusManager: typingsSlinky.officeDashJs.Office.ProjectTaskFields.StatusManager with Double = js.native
  /* 274 */ val Successors: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Successors with Double = js.native
  /* 261 */ val Summary: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Summary with Double = js.native
  /* 160 */ val TaskCalendarGUID: typingsSlinky.officeDashJs.Office.ProjectTaskFields.TaskCalendarGUID with Double = js.native
  /* 277 */ val TaskGUID: typingsSlinky.officeDashJs.Office.ProjectTaskFields.TaskGUID with Double = js.native
  /* 7 */ val Text1: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text1 with Double = js.native
  /* 8 */ val Text10: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text10 with Double = js.native
  /* 11 */ val Text11: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text11 with Double = js.native
  /* 12 */ val Text12: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text12 with Double = js.native
  /* 13 */ val Text13: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text13 with Double = js.native
  /* 14 */ val Text14: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text14 with Double = js.native
  /* 15 */ val Text15: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text15 with Double = js.native
  /* 16 */ val Text16: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text16 with Double = js.native
  /* 17 */ val Text17: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text17 with Double = js.native
  /* 18 */ val Text18: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text18 with Double = js.native
  /* 19 */ val Text19: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text19 with Double = js.native
  /* 22 */ val Text2: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text2 with Double = js.native
  /* 23 */ val Text20: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text20 with Double = js.native
  /* 24 */ val Text21: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text21 with Double = js.native
  /* 25 */ val Text22: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text22 with Double = js.native
  /* 26 */ val Text23: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text23 with Double = js.native
  /* 27 */ val Text24: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text24 with Double = js.native
  /* 28 */ val Text25: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text25 with Double = js.native
  /* 29 */ val Text26: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text26 with Double = js.native
  /* 30 */ val Text27: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text27 with Double = js.native
  /* 31 */ val Text28: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text28 with Double = js.native
  /* 32 */ val Text29: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text29 with Double = js.native
  /* 35 */ val Text3: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text3 with Double = js.native
  /* 36 */ val Text30: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text30 with Double = js.native
  /* 39 */ val Text4: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text4 with Double = js.native
  /* 42 */ val Text5: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text5 with Double = js.native
  /* 45 */ val Text6: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text6 with Double = js.native
  /* 48 */ val Text7: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text7 with Double = js.native
  /* 51 */ val Text8: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text8 with Double = js.native
  /* 54 */ val Text9: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Text9 with Double = js.native
  /* 276 */ val TotalSlack: typingsSlinky.officeDashJs.Office.ProjectTaskFields.TotalSlack with Double = js.native
  /* 278 */ val Type: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Type with Double = js.native
  /* 279 */ val WBS: typingsSlinky.officeDashJs.Office.ProjectTaskFields.WBS with Double = js.native
  /* 280 */ val WBSPREDECESSORS: typingsSlinky.officeDashJs.Office.ProjectTaskFields.WBSPREDECESSORS with Double = js.native
  /* 281 */ val WBSSUCCESSORS: typingsSlinky.officeDashJs.Office.ProjectTaskFields.WBSSUCCESSORS with Double = js.native
  /* 282 */ val WSSID: typingsSlinky.officeDashJs.Office.ProjectTaskFields.WSSID with Double = js.native
  /* 271 */ val Work: typingsSlinky.officeDashJs.Office.ProjectTaskFields.Work with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectTaskFields with Double] = js.native
}

