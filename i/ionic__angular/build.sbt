organization := "org.scalablytyped.slinky"
name := "ionic__angular"
version := "5.5.0-9abd7c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "angular__common" % "11.0.2-41e1ca",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "11.0.2-bbe9d7",
  "org.scalablytyped.slinky" %%% "angular__core" % "11.0.2-f17331",
  "org.scalablytyped.slinky" %%% "angular__forms" % "11.0.2-b0b598",
  "org.scalablytyped.slinky" %%% "angular__router" % "11.0.2-6bf416",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200820Z-bf84f7",
  "org.scalablytyped.slinky" %%% "ionic__core" % "5.5.0-d387ac",
  "org.scalablytyped.slinky" %%% "ionicons" % "5.2.3-45d74e",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.3-2c76fd",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.3-7ba562",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "swiper" % "5.4-dt-20201028Z-c0887f",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20201002Z-62ab37",
  "org.scalablytyped.slinky" %%% "typescript" % "4.1.2-67d95e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
