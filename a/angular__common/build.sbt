organization := "org.scalablytyped.slinky"
name := "angular__common"
version := "8.2.14-00723a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-1acc03",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-e6d033",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200721Z-06203e",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-51ed10",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.0-af84c7",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.0-096622",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-6f3e5c",
  "org.scalablytyped.slinky" %%% "typescript" % "3.9.7-723650")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
