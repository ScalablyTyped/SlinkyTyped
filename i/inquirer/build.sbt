organization := "org.scalablytyped.slinky"
name := "inquirer"
version := "6.5-dt-20200226Z-c833c2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200609Z-5ab0d9",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.5-fda3d4",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.5-8e1e9a",
  "org.scalablytyped.slinky" %%% "std" % "3.9-18eec6",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-9d6b14")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
