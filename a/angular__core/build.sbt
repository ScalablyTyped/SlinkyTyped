organization := "org.scalablytyped.slinky"
name := "angular__core"
version := "8.2.14-c0c073"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-86a7a8",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-e2bc21",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-f2cfe3",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-518e60",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200225Z-41b466",
  "org.scalablytyped.slinky" %%% "typescript" % "3.8.2-65a561")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
